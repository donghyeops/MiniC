import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Visitor extends MiniCBaseVisitor<Variable> {
	HashMap<String, Variable> variables = new HashMap<String, Variable>();
	Scanner scan = new Scanner(System.in);
	
	@Override
	public Variable visitStart(MiniCParser.StartContext ctx) {
		// TODO Auto-generated method stub
		return super.visitStart(ctx);
	}

	@Override
	public Variable visitLine(MiniCParser.LineContext ctx) {
		// TODO Auto-generated method stub
		return super.visitLine(ctx);
	}

	@Override
	public Variable visitDef(MiniCParser.DefContext ctx) {
		String name = ctx.ID().getText();
		Variable variable = null;
		if (ctx.expr() != null)
			variable = visit(ctx.expr());
		switch(ctx.type_ID.getType()) {
		case MiniCParser.KW_INT:
			if (variable == null)
				variables.put(name, new Variable("int", null));
			else if (variable.type.equals("int"))
				variables.put(name, new Variable(variable.type, variable.value));
			else
				System.out.println("타입 에러 : 정수를 입력해주세요.");
			break;
		case MiniCParser.KW_DOUBLE:
			if (variable == null)
				variables.put(name, new Variable("double", null));
			else if (variable.type.equals("double"))
				variables.put(name, new Variable(variable.type, variable.value));
			else
				System.out.println("타입 에러 : 실수를 입력해주세요.");
			break;
		case MiniCParser.KW_STRING:
			if (variable == null)
				variables.put(name, new Variable("string", null));
			else if (variable.type.equals("string"))
				variables.put(name, new Variable(variable.type, variable.value));
			else
				System.out.println("타입 에러 : 문자를 입력해주세요.");
		}
		
		return null;
	}

	@Override
	public Variable visitMinusExpr(MiniCParser.MinusExprContext ctx) {
		
		Variable variable = visit(ctx.expr());
		if (variable.type.equals("int"))
			return new Variable("int", -variable.asInt());  
		else if (variable.type.equals("double"))
			return new Variable("double", -variable.asDouble());  
		else {
			System.out.println("잘못된 연산(-)입니다.");
			return variable;
		}
	}

	@Override
	public Variable visitNotExpr(MiniCParser.NotExprContext ctx) {
		Variable variable = visit(ctx.expr());
		if (variable.type.equals("int")) {
			Integer value = variable.asInt();
			if (value != 0)
				return new Variable("int", 0); 
			else
				return new Variable("int", 1); 
		}
		else if (variable.type.equals("double")) {
			Double value = variable.asDouble();
			if (value != 0)
				return new Variable("double", 0.0);
			else
				return new Variable("double", 1.0);
		}
		else {
			System.out.println("잘못된 연산(-)입니다.");
			return variable;
		}
	}
	
	@Override
	public Variable visitMulExpr(MiniCParser.MulExprContext ctx) {
		Variable left = visit(ctx.expr(0));
		Variable right = visit(ctx.expr(1));
		
		switch (ctx.op.getType()) {
		case MiniCParser.MUL:
			if (left.type.equals("double") || right.type.equals("double"))
				return new Variable("double", left.asDouble()*right.asDouble());
			else
				return new Variable("int", left.asInt()*right.asInt());
		case MiniCParser.DIV:
			if (left.type.equals("double") || right.type.equals("double"))
				return new Variable("double", left.asDouble()/right.asDouble());
			else
				return new Variable("int", left.asInt()/right.asInt());
		case MiniCParser.MOD:
			if (left.type.equals("double") || right.type.equals("double"))
				return new Variable("double", left.asDouble()%right.asDouble());
			else
				return new Variable("int", left.asInt()%right.asInt());
		}
		return null;
	}
	
	@Override
	public Variable visitAddExpr(MiniCParser.AddExprContext ctx) {
		Variable left = visit(ctx.expr(0));
		Variable right = visit(ctx.expr(1));
		
		switch (ctx.op.getType()) {
		case MiniCParser.PLUS:
			if (left.type.equals("double") || right.type.equals("double"))
				return new Variable("double", left.asDouble()+right.asDouble());
			else
				return new Variable("int", left.asInt()+right.asInt());
		case MiniCParser.MINUS:
			if (left.type.equals("double") || right.type.equals("double"))
				return new Variable("double", left.asDouble()-right.asDouble());
			else
				return new Variable("int", left.asInt()-right.asInt());
		}
		return null;
	}
	
	@Override
	public Variable visitRelationExpr(MiniCParser.RelationExprContext ctx) {
		Double left = visit(ctx.expr(0)).asDouble();
		Double right = visit(ctx.expr(1)).asDouble();
		switch (ctx.op.getType()) {
		case MiniCParser.LIEQ:
			return new Variable("boolean", left>=right);
		case MiniCParser.RIEQ:
			return new Variable("boolean", left<=right);
		case MiniCParser.LI:
			return new Variable("boolean", left>right);
		case MiniCParser.RI:
			return new Variable("boolean", left<right);
		}
		return null;
	}
	
	@Override
	public Variable visitEqualExpr(MiniCParser.EqualExprContext ctx) {
		Double left = visit(ctx.expr(0)).asDouble();
		Double right = visit(ctx.expr(1)).asDouble();
		switch (ctx.op.getType()) {
		case MiniCParser.EQ:
			return new Variable("boolean", left.equals(right));
		case MiniCParser.NEQ:
			return new Variable("boolean", !left.equals(right));
		}
		return null;
	}
	
	@Override
	public Variable visitAndExpr(MiniCParser.AndExprContext ctx) {
		Boolean left = visit(ctx.expr(0)).asBoolean();
		Boolean right = visit(ctx.expr(1)).asBoolean();
		return new Variable("boolean", left && right);
	}
	
	@Override
	public Variable visitOrExpr(MiniCParser.OrExprContext ctx) {
		Boolean left = visit(ctx.expr(0)).asBoolean();
		Boolean right = visit(ctx.expr(1)).asBoolean();
		return new Variable("boolean", left || right);
	}
	
	@Override
	public Variable visitExprAtom(MiniCParser.ExprAtomContext ctx) {
		return visit(ctx.expr());
	}
	
	@Override
	public Variable visitIntAtom(MiniCParser.IntAtomContext ctx) {
		return new Variable("int", Integer.parseInt(ctx.getText()));
	}
	
	@Override
	public Variable visitDoubleAtom(MiniCParser.DoubleAtomContext ctx) {
		return new Variable("double", Double.parseDouble(ctx.getText()));
	}
	
	@Override
	public Variable visitIdAtom(MiniCParser.IdAtomContext ctx) {
		Variable variable = variables.get(ctx.getText());
		if (variable == null) {
			System.out.println("잘못된 참조 (" + ctx.getText() + ")");
		}
		return variable;
	}
	
	@Override
	public Variable visitStringAtom(MiniCParser.StringAtomContext ctx) {
		return new Variable("string", ctx.getText());
	}
	
	
	@Override
	public Variable visitAssign(MiniCParser.AssignContext ctx) {
		String id = ctx.ID().getText();
		Variable variable = variables.get(id);
		if (variable == null) {
			System.out.println("잘못된 참조");
			return null;
		}
		if (ctx.expr() == null)
			return new Variable(variable.type, variable.value);
		else {
			Variable inputValue = visit(ctx.expr());
			if (variable.type.equals("int")) {
				inputValue = new Variable("int", inputValue.asInt());
				variables.put(id, inputValue);
				return inputValue;
			}
			if (variable.type.equals("double")) {
				inputValue = new Variable("double", inputValue.asDouble());
				variables.put(id, inputValue);
				return inputValue;
			}
			if (variable.type.equals("string")) {
				inputValue = new Variable("string", inputValue.asString());
				variables.put(id, inputValue);
				return inputValue;
			}
		}
		return null;
	}
	
	@Override
	public Variable visitPlusplusExpr(MiniCParser.PlusplusExprContext ctx) {
		String name = ctx.ID().getText();
		Variable variable = variables.get(name);
		if (variable == null) {
			System.out.println("잘못된 참조");
			return null;
		}
		if (variable.type.equals("int")) {
			variables.put(name, variable.setValue(variable.asInt()+1));
		} else if (variable.type.equals("double")) {
			variables.put(name, variable.setValue(variable.asDouble()+1));
		} else {
			System.out.println("잘못된 타입");
			return null;
		}
		return variable;
	}
	
	@Override
	public Variable visitMinminExpr(MiniCParser.MinminExprContext ctx) {
		String name = ctx.ID().getText();
		Variable variable = variables.get(name);
		if (variable == null) {
			System.out.println("잘못된 참조");
			return null;
		}
		if (variable.type.equals("int")) {
			variables.put(name, variable.setValue(variable.asInt()-1));
		} else if (variable.type.equals("double")) {
			variables.put(name, variable.setValue(variable.asDouble()-1));
		} else {
			System.out.println("잘못된 타입");
			return null;
		}
		return variable;
	}
	
	
	@Override
	public Variable visitFunc(MiniCParser.FuncContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFunc(ctx);
	}

	//준배
		@Override
		public Variable visitParameterPrintf(MiniCParser.ParameterPrintfContext ctx) {
			String output = ctx.STRING().getText().replace("\"", "");//앞에부분
			String parameter = ctx.PARAMETER().getText();//뒤에부분
			
			//앞부분 정리
			String[] print_split = output.split("%");//%로 구분하여 자르기
			
			//뒤에부분 정리
			parameter = parameter.replace(" ", "");//빈칸 삭제
			String[] parameger_split = parameter.split(",");//,로 구분하여 자르기
			ArrayList<String> parameter_list = new ArrayList<String>();//뒷부분 넣을 리스트
			int parameter_length = parameger_split.length-1;//뒷부분 갯수

			//뒷부분 변수가 정의되어있는지 확인하는 과정
			for(int i=1;i<=parameter_length;i++){
				Variable variable = variables.get(parameger_split[i]); //해쉬에 있는값인지 확인
				if (variable == null) {
					System.out.println("정의되지 않은 변수입니다.");
					i=parameter_length; //중간에 종료
					parameter_list=null; //반환값 null
				}
				else{
					parameter_list.add(parameger_split[i]);
				}
			}
			
			//시작
			if(parameter_list.size()!=print_split.length-1){
				System.out.println("인자개수가 맞지않습니다.");
			}else {
				if(parameter_list!=null) {
					for(int i=0;i<parameter_list.size();i++){		
						
						//System.out.println(parameters.get(i));//ABC
						//print_split[i+1].charAt(0)
						
						Variable variable = variables.get(parameter_list.get(i));
						if (variable.type.equals("int")&&print_split[i+1].charAt(0)=='d') { // 타입 확인
							//System.out.println("hid"); //d,f,s
							output = output.replaceFirst("%d", variable.value.toString());
							
						} else if (variable.type.equals("double")&&print_split[i+1].charAt(0)=='f') { // 타입 확인
							//System.out.println("hif"); //d,f,s
							output = output.replaceFirst("%f", variable.value.toString());
							
						}else if (variable.type.equals("string")&&print_split[i+1].charAt(0)=='s') { // 타입 확인
							//System.out.println("his"); //d,f,s
							output = output.replaceFirst("%s", variable.value.toString().replace("\"",""));
						}
						else{
							System.out.println("인자 매칭 실패"); //d,f,s
							i=parameter_list.size();
						}
					}		
				}
				output=output.replace("\\n", "\n");
				output=output.replace("\\t", "\t");
				System.out.print(output);
			}
			
			return null;
		}
		
		
		@Override
		public Variable visitCommonPrintf(MiniCParser.CommonPrintfContext ctx) {
			String output = ctx.STRING().getText().replace("\"", "");		
			output=output.replace("\\n", "\n");
			output=output.replace("\\t", "\t");
			System.out.print(output);
			
			return null;
		}

		@Override
		public Variable visitScanf(MiniCParser.ScanfContext ctx) {
			String output = ctx.STRING().getText().replace("\"", "");//앞에부분
			String parameter = ctx.SCANPARAMETER().getText();//뒤에부분
			
			//앞부분 정리
			String[] print_split = output.split("%");//%로 구분하여 자르기
			
			//뒤에부분 정리
			parameter = parameter.replace(" ", "");//빈칸 삭제
			parameter = parameter.replace("&", "");//빈칸 삭제
			String[] parameger_split = parameter.split(",");//,로 구분하여 자르기
			ArrayList<String> parameter_list = new ArrayList<String>();//뒷부분 넣을 리스트
			int parameter_length = parameger_split.length-1;//뒷부분 갯수

			//뒷부분 변수가 정의되어있는지 확인하는 과정
			for(int i=1;i<=parameter_length;i++){
				Variable variable = variables.get(parameger_split[i]); //해쉬에 있는값인지 확인
				if (variable == null) {
					System.out.println("정의되지 않은 변수입니다.");
					i=parameter_length; //중간에 종료
					parameter_list=null; //반환값 null
				}
				else{
					parameter_list.add(parameger_split[i]);
				}
			}
			
			if(parameter_list.size()!=print_split.length-1){
				System.out.println("인자개수가 맞지않습니다.");
			}else {
				if(parameter_list!=null) {
					for(int i=0;i<parameter_list.size();i++){		
						String input = scan.nextLine();//입력
						//System.out.println(parameters.get(i));//ABC
						//print_split[i+1].charAt(0)
						
						Variable variable = variables.get(parameter_list.get(i));
						if (variable.type.equals("int")&&print_split[i+1].charAt(0)=='d') { // 타입 확인
							//System.out.println("hid"); //d,f,s
							variables.put(parameter_list.get(i), new Variable("int",  Integer.parseInt(input)));
							
						} else if (variable.type.equals("double")&&print_split[i+1].charAt(0)=='f') { // 타입 확인
							//System.out.println("hif"); //d,f,s
							variables.put(parameter_list.get(i), new Variable("double",  Double.parseDouble(input)));
							
						}else if (variable.type.equals("string")&&print_split[i+1].charAt(0)=='s') { // 타입 확인
							//System.out.println("his"); //d,f,s
							input="\""+input+"\"";
							variables.put(parameter_list.get(i), new Variable("string",  input));
						}
						else{
							System.out.println("인자 매칭 실패"); //d,f,s
							i=parameter_list.size();
						}
					}
				}
				
			}
			return null;
		}


	@Override 
	public Variable visitIfBlock(MiniCParser.IfBlockContext ctx) {
		List<MiniCParser.If_contentsContext> if_contents = ctx.if_contents();
		
		for (MiniCParser.If_contentsContext if_content : if_contents) {
			if (visit(if_content.condition()).asBoolean()) {
				return visit(if_content.condition_block());
			}
		}
		
		if (ctx.condition_block() != null) {
			return visit(ctx.condition_block());
		}
		else {
			return null;
		}
	}

	@Override // 동협
	public Variable visitWhile_contents(MiniCParser.While_contentsContext ctx) {
		while (visit(ctx.condition()).asBoolean()) // 조건 검사
			visit(ctx.condition_block()); // while문 코드블럭 실행
		
		return null;
	}
	
	@Override // 동협
	public Variable visitFor_contents(MiniCParser.For_contentsContext ctx) {
		Variable con = null;
		if (ctx.def() != null)
			con = visit(ctx.def());
		else
			con = visit(ctx.assign());
		boolean condition_flag = false;
		boolean line_flag = false;
		
		if (ctx.assign() != null) { 
			con = visit(ctx.assign());
		}
		if (ctx.condition() != null) {
			condition_flag = true;
		}
		if (ctx.line() != null) {
			line_flag = true;
		}
		while (!(condition_flag && !visit(ctx.condition()).asBoolean())) { // 조건 검사
			visit(ctx.condition_block()); // for문 코드블럭 실행
			if (line_flag)
				visit(ctx.line()); // end action 실행
		}
		
		return null;
	}

	@Override
	public Variable visitCondition(MiniCParser.ConditionContext ctx) {
		Variable variable = null;
		if (ctx.assign() != null)
			variable = visit(ctx.assign());
		else
			variable = visit(ctx.expr());
		if (variable.type.equals("string"))
			System.out.println("올바른 타입이 아닙니다.(string)");
		return new Variable("boolean", variable.asBoolean());
	}

}
