
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package analisis;

import java_cup.runtime.Symbol;
import java.util.*;
import clases.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\030\000\002\002\004\000\002\002\003\000\002\003" +
    "\004\000\002\003\003\000\002\004\003\000\002\004\003" +
    "\000\002\004\003\000\002\004\004\000\002\005\007\000" +
    "\002\005\007\000\002\006\005\000\002\006\003\000\002" +
    "\013\005\000\002\013\003\000\002\007\003\000\002\011" +
    "\007\000\002\010\005\000\002\010\005\000\002\010\005" +
    "\000\002\010\004\000\002\010\005\000\002\010\003\000" +
    "\002\010\003\000\002\012\007" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\061\000\012\003\013\004\005\005\014\006\010\001" +
    "\002\000\014\002\ufffb\003\ufffb\004\ufffb\005\ufffb\006\ufffb" +
    "\001\002\000\004\007\052\001\002\000\014\002\000\003" +
    "\013\004\005\005\014\006\010\001\002\000\014\002\ufffe" +
    "\003\ufffe\004\ufffe\005\ufffe\006\ufffe\001\002\000\004\007" +
    "\042\001\002\000\014\002\ufffd\003\ufffd\004\ufffd\005\ufffd" +
    "\006\ufffd\001\002\000\014\002\ufffc\003\ufffc\004\ufffc\005" +
    "\ufffc\006\ufffc\001\002\000\004\022\041\001\002\000\004" +
    "\007\017\001\002\000\004\002\016\001\002\000\004\002" +
    "\001\001\002\000\004\016\020\001\002\000\012\003\023" +
    "\007\021\015\024\024\026\001\002\000\014\012\ufff3\013" +
    "\ufff3\014\ufff3\022\ufff3\025\ufff3\001\002\000\014\012\uffec" +
    "\013\uffec\014\uffec\022\uffec\025\uffec\001\002\000\014\012" +
    "\uffeb\013\uffeb\014\uffeb\022\uffeb\025\uffeb\001\002\000\012" +
    "\003\023\007\021\015\024\024\026\001\002\000\012\012" +
    "\033\013\032\014\030\022\037\001\002\000\012\003\023" +
    "\007\021\015\024\024\026\001\002\000\012\012\033\013" +
    "\032\014\030\025\031\001\002\000\012\003\023\007\021" +
    "\015\024\024\026\001\002\000\014\012\uffed\013\uffed\014" +
    "\uffed\022\uffed\025\uffed\001\002\000\012\003\023\007\021" +
    "\015\024\024\026\001\002\000\012\003\023\007\021\015" +
    "\024\024\026\001\002\000\014\012\ufff1\013\ufff1\014\030" +
    "\022\ufff1\025\ufff1\001\002\000\014\012\ufff0\013\ufff0\014" +
    "\030\022\ufff0\025\ufff0\001\002\000\014\012\uffef\013\uffef" +
    "\014\uffef\022\uffef\025\uffef\001\002\000\014\002\ufff2\003" +
    "\ufff2\004\ufff2\005\ufff2\006\ufff2\001\002\000\014\012\uffee" +
    "\013\uffee\014\uffee\022\uffee\025\uffee\001\002\000\014\002" +
    "\ufffa\003\ufffa\004\ufffa\005\ufffa\006\ufffa\001\002\000\004" +
    "\021\043\001\002\000\004\010\045\001\002\000\006\022" +
    "\047\023\046\001\002\000\010\020\ufff4\022\ufff4\023\ufff4" +
    "\001\002\000\004\010\050\001\002\000\014\002\uffea\003" +
    "\uffea\004\uffea\005\uffea\006\uffea\001\002\000\010\020\ufff5" +
    "\022\ufff5\023\ufff5\001\002\000\014\002\uffff\003\uffff\004" +
    "\uffff\005\uffff\006\uffff\001\002\000\004\016\053\001\002" +
    "\000\010\003\055\011\056\017\054\001\002\000\004\010" +
    "\045\001\002\000\004\022\ufff6\001\002\000\004\022\061" +
    "\001\002\000\004\022\060\001\002\000\014\002\ufff9\003" +
    "\ufff9\004\ufff9\005\ufff9\006\ufff9\001\002\000\014\002\ufff8" +
    "\003\ufff8\004\ufff8\005\ufff8\006\ufff8\001\002\000\006\020" +
    "\063\023\046\001\002\000\004\022\ufff7\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\061\000\016\002\014\003\005\004\006\005\010\011" +
    "\011\012\003\001\001\000\002\001\001\000\002\001\001" +
    "\000\012\004\050\005\010\011\011\012\003\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\006\007\021" +
    "\010\024\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\006\007\021\010\037\001\001\000\002" +
    "\001\001\000\006\007\021\010\026\001\001\000\002\001" +
    "\001\000\006\007\021\010\035\001\001\000\002\001\001" +
    "\000\006\007\021\010\034\001\001\000\006\007\021\010" +
    "\033\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\013\043\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\006\056\001\001\000\004\013\061\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    public LinkedList<IStatement> AST = new LinkedList<>();
    public LinkedList<String> syntaxErrors = new LinkedList<>();
    public LinkedList<String> evaluationResults = new LinkedList<>();

    @Override
    public void report_error(String message, Object info) {
        Symbol s = (Symbol) info;
        syntaxErrors.add("Syntax error at line " + (s.left + 1) + ", column " + (s.right + 1) + ": " + message);
    }

    @Override
    public void report_fatal_error(String message, Object info) {
        Symbol s = (Symbol) info;
        syntaxErrors.add("Fatal syntax error at line " + (s.left + 1) + ", column " + (s.right + 1) + ": " + message);
        done_parsing();
    }

    public void printEvaluationResults() {
        for (String result : evaluationResults) {
            System.out.println(result);
        }
    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= ini EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		LinkedList<IStatement> start_val = (LinkedList<IStatement>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // ini ::= instrucciones 
            {
              LinkedList<IStatement> RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		LinkedList<IStatement> i = (LinkedList<IStatement>)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = i; parser.AST = i; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("ini",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // instrucciones ::= instrucciones instruccion 
            {
              LinkedList<IStatement> RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		LinkedList<IStatement> i = (LinkedList<IStatement>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int jleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int jright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		IStatement j = (IStatement)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = i; RESULT.add(j); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("instrucciones",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // instrucciones ::= instruccion 
            {
              LinkedList<IStatement> RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		IStatement i = (IStatement)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new LinkedList<IStatement>(); RESULT.add(i); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("instrucciones",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // instruccion ::= conjunto_def 
            {
              IStatement RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		SetDefine s = (SetDefine)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = s; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruccion",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // instruccion ::= statement 
            {
              IStatement RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		SetOperation s = (SetOperation)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = s; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruccion",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // instruccion ::= evaluate_statement 
            {
              IStatement RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		EvaluateStatement s = (EvaluateStatement)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = s; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruccion",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // instruccion ::= error PUNCOM 
            {
              IStatement RESULT =null;
		 parser.syntaxErrors.add("Error in instruction"); RESULT = null; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruccion",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // conjunto_def ::= CONJ ID DOSP conjunto_elements PUNCOM 
            {
              SetDefine RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Set<Integer> c = (Set<Integer>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new SetDefine(id, c); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("conjunto_def",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // conjunto_def ::= CONJ ID DOSP UNIVERSO PUNCOM 
            {
              SetDefine RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		 RESULT = new SetDefine(id, generateUniverseSet()); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("conjunto_def",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // conjunto_elements ::= CORI numeros CORD 
            {
              Set<Integer> RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		List<Integer> n = (List<Integer>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new HashSet<>(n); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("conjunto_elements",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // conjunto_elements ::= error 
            {
              Set<Integer> RESULT =null;
		 parser.syntaxErrors.add("Error in set elements"); RESULT = new HashSet<>(); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("conjunto_elements",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // numeros ::= numeros COMA NUM 
            {
              List<Integer> RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		List<Integer> n = (List<Integer>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int numleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int numright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String num = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 n.add(Integer.valueOf(num)); RESULT = n; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("numeros",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // numeros ::= NUM 
            {
              List<Integer> RESULT =null;
		int numleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int numright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String num = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new ArrayList<>(); RESULT.add(Integer.valueOf(num)); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("numeros",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // conjunto ::= ID 
            {
              SetReference RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new SetReference(id); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("conjunto",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // statement ::= OPERA ID DOSP expr PUNCOM 
            {
              SetOperation RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		IOperation e = (IOperation)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new SetOperation(id, e); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("statement",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // expr ::= expr TK_UNION expr 
            {
              IOperation RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		IOperation e1 = (IOperation)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		IOperation e2 = (IOperation)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Union(e1, e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // expr ::= expr TK_INTERSECCION expr 
            {
              IOperation RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		IOperation e1 = (IOperation)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		IOperation e2 = (IOperation)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Intersection(e1, e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // expr ::= expr TK_DIFERENCIA expr 
            {
              IOperation RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		IOperation e1 = (IOperation)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		IOperation e2 = (IOperation)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Difference(e1, e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // expr ::= TK_COMPLEMENTO expr 
            {
              IOperation RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		IOperation e = (IOperation)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Complement(e); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // expr ::= PARI expr PARD 
            {
              IOperation RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		IOperation e = (IOperation)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = e; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // expr ::= conjunto 
            {
              IOperation RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		SetReference c = (SetReference)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = c; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // expr ::= error 
            {
              IOperation RESULT =null;
		 parser.syntaxErrors.add("Error in expression"); RESULT = null; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // evaluate_statement ::= EVALUAR ID FLECHA numeros PUNCOM 
            {
              EvaluateStatement RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		List<Integer> n = (List<Integer>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 
        RESULT = new EvaluateStatement(id, n);
        parser.evaluationResults.add("Evaluating operation: " + id);
    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("evaluate_statement",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
