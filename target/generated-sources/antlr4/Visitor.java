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
		case MiniCParser.TYPE_INT:
			if (variable == null)
				variables.put(name, new Variable("int", null));
			else if (variable.type.equals("int"))
				variables.put(name, variable);
			else
				System.out.println("타입 에러 : 정수를 입력해주세요.");
			break;
		case MiniCParser.TYPE_DOUBLE:
			if (variable == null)
				variables.put(name, new Variable("double", null));
			else if (variable.type.equals("double"))
				variables.put(name, variable);
			else
				System.out.println("타입 에러 : 실수를 입력해주세요.");
			break;
		case MiniCParser.TYPE_STRING:
			if (variable == null)
				variables.put(name, new Variable("string", null));
			else if (variable.type.equals("string"))
				variables.put(name, variable);
			else
				System.out.println("타입 에러 : 문자를 입력해주세요.");
		}
		
		return null;
	}

	@Override
	public Variable visitMinusExpr(MiniCParser.MinusExprContext ctx) {
		
		Variable variable = visit(ctx.expr());
		if (variable.type.equals("int"))
			return variable.setValue(-variable.asInt());  
		else if (variable.type.equals("double"))
			return variable.setValue(-variable.asDouble());  
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
				return variable.setValue(0);
			else
				return variable.setValue(1);
		}
		else if (variable.type.equals("double")) {
			Double value = variable.asDouble();
			if (value != 0)
				return variable.setValue(0.0);
			else
				return variable.setValue(1.0);
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
			return variable;
		else {
			Variable inputValue = visit(ctx.expr());
			if (variable.type.equals("int")) {
				inputValue.setValue(inputValue.asInt());
				inputValue.type = "int";
				variables.put(id, inputValue);
				return inputValue;
			}
			if (variable.type.equals("double")) {
				inputValue.setValue(inputValue.asDouble());
				inputValue.type = "double";
				variables.put(id, inputValue);
				return inputValue;
			}
			if (variable.type.equals("string")) {
				inputValue.setValue(inputValue.asString());
				inputValue.type = "string";
				variables.put(id, inputValue);
				return inputValue;
			}
		}
		return null;
	}
	
	@Override
	public Variable visitFunc(MiniCParser.FuncContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFunc(ctx);
	}

	@Override
	public Variable visitPrintf(MiniCParser.PrintfContext ctx) {
		Variable variable = visit(ctx.expr());
		if (variable.type.equals("string"))
			System.out.println(variable.asString().replace("\"", ""));
		else
			System.out.println(variable.value);
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Variable visitScanf(MiniCParser.ScanfContext ctx) {
		String input = ctx.STRING().getText().replace("\"", "");
		String id = ctx.ID().getText();
		if(input.equals("%d")){
			String input_int = scan.nextLine();
			//인풋 어썰트
			Variable variable_input = variables.get(id); // 해당하는 값 불러오기 (타입 확인을 위해)
			
			if (variable_input.type.equals("int")) { // 타입 확인
				variables.put(id, new Variable("int", Integer.parseInt(input_int)));
			} else {
				System.out.println("타입 에러");
			}
		} else if(input.equals("%f")){
			String input_double = scan.nextLine();
			
			//인풋 어썰트
			Variable variable_input = variables.get(id); // 해당하는 값 불러오기 (타입 확인을 위해)
			
			if (variable_input.type.equals("double")) { // 타입 확인
				variables.put(id, new Variable("double",  Double.parseDouble(input_double)));
			} else {
				System.out.println("타입 에러");
			}
		} else if(input.equals("%s")){
			String input_string = scan.nextLine();
			
			//인풋 어썰트
			Variable variable_input = variables.get(id); // 해당하는 값 불러오기 (타입 확인을 위해)
			input_string="\""+input_string+"\"";
			if (variable_input.type.equals("string")) { // 타입 확인
				variables.put(id, new Variable("string",  input_string));
			} else {
				System.out.println("타입 에러");
			}
		}
		return null;
	}

	@Override
	public Variable visitPrintf2(MiniCParser.Printf2Context ctx) {
		return null;
	}

	@Override 
	public Variable visitBlock(MiniCParser.BlockContext ctx) {
		List<MiniCParser.Condition_contentsContext> conditions = ctx.condition_contents();
		
		for (MiniCParser.Condition_contentsContext condition : conditions) {
			if (visit(condition.condition()).asBoolean()) {
				return visit(condition.condition_block());
			}
		}
		
		if (ctx.condition_block() != null) {
			return visit(ctx.condition_block());
		}
		else {
			return null;
		}
	}

	@Override
	public Variable visitCondition_contents(MiniCParser.Condition_contentsContext ctx) {
		// TODO Auto-generated method stub
		return super.visitCondition_contents(ctx);
	}

	@Override
	public Variable visitCondition_block(MiniCParser.Condition_blockContext ctx) {
		// TODO Auto-generated method stub
		return super.visitCondition_block(ctx);
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
		return variable;
	}

}
