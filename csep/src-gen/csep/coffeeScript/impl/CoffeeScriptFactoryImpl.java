/**
 */
package csep.coffeeScript.impl;

import csep.coffeeScript.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoffeeScriptFactoryImpl extends EFactoryImpl implements CoffeeScriptFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CoffeeScriptFactory init()
  {
    try
    {
      CoffeeScriptFactory theCoffeeScriptFactory = (CoffeeScriptFactory)EPackage.Registry.INSTANCE.getEFactory(CoffeeScriptPackage.eNS_URI);
      if (theCoffeeScriptFactory != null)
      {
        return theCoffeeScriptFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CoffeeScriptFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CoffeeScriptFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case CoffeeScriptPackage.ROOT: return createRoot();
      case CoffeeScriptPackage.BODY: return createBody();
      case CoffeeScriptPackage.LINE: return createLine();
      case CoffeeScriptPackage.STMT: return createStmt();
      case CoffeeScriptPackage.COMMENT: return createComment();
      case CoffeeScriptPackage.REQUIRE_STMT: return createRequireStmt();
      case CoffeeScriptPackage.RETURN_STMT: return createReturnStmt();
      case CoffeeScriptPackage.THROW_STMT: return createThrowStmt();
      case CoffeeScriptPackage.SUPER_CLASS: return createSuperClass();
      case CoffeeScriptPackage.CLASS_DECLARATION: return createClassDeclaration();
      case CoffeeScriptPackage.ASSIGNED_CLASS_DECLARATION: return createAssignedClassDeclaration();
      case CoffeeScriptPackage.EXPRESSION: return createExpression();
      case CoffeeScriptPackage.FOR_VALUE: return createForValue();
      case CoffeeScriptPackage.FOR_SOURCE: return createForSource();
      case CoffeeScriptPackage.RANGE: return createRange();
      case CoffeeScriptPackage.APPLICATION: return createApplication();
      case CoffeeScriptPackage.FEATURE_CALL: return createFeatureCall();
      case CoffeeScriptPackage.FUNCTION_CALL: return createFunctionCall();
      case CoffeeScriptPackage.PROPERTY_ACCESS: return createPropertyAccess();
      case CoffeeScriptPackage.THIS_PROPERTY: return createThisProperty();
      case CoffeeScriptPackage.NAMED_PROPERTY_ACCESS: return createNamedPropertyAccess();
      case CoffeeScriptPackage.INDEXED_PROPERTY_ACCESS: return createIndexedPropertyAccess();
      case CoffeeScriptPackage.INDEX: return createIndex();
      case CoffeeScriptPackage.PRIMARY_EXPRESSION: return createPrimaryExpression();
      case CoffeeScriptPackage.BLOCK: return createBlock();
      case CoffeeScriptPackage.CASE: return createCase();
      case CoffeeScriptPackage.IF_EXP: return createIfExp();
      case CoffeeScriptPackage.COND_BLOCK: return createCondBlock();
      case CoffeeScriptPackage.ID_REF: return createIdRef();
      case CoffeeScriptPackage.ID: return createId();
      case CoffeeScriptPackage.PROPERTY: return createProperty();
      case CoffeeScriptPackage.VARIABLE: return createVariable();
      case CoffeeScriptPackage.ASSIGNABLE_ARRAY: return createAssignableArray();
      case CoffeeScriptPackage.ASSIGNABLE_ARG_LIST: return createAssignableArgList();
      case CoffeeScriptPackage.ASSIGNABLE_ARG: return createAssignableArg();
      case CoffeeScriptPackage.ASSIGNABLE: return createAssignable();
      case CoffeeScriptPackage.ARG: return createArg();
      case CoffeeScriptPackage.ARG_LINE: return createArgLine();
      case CoffeeScriptPackage.EXPLICIT_ARG_LIST: return createExplicitArgList();
      case CoffeeScriptPackage.ARG_LIST: return createArgList();
      case CoffeeScriptPackage.ARRAY: return createArray();
      case CoffeeScriptPackage.DICTIONARY: return createDictionary();
      case CoffeeScriptPackage.DICT_ITEMS: return createDictItems();
      case CoffeeScriptPackage.EXPLICIT_DICT_ITEMS: return createExplicitDictItems();
      case CoffeeScriptPackage.DICT_LINE: return createDictLine();
      case CoffeeScriptPackage.DICT_ITEM: return createDictItem();
      case CoffeeScriptPackage.DICT_KEY: return createDictKey();
      case CoffeeScriptPackage.LAMBDA: return createLambda();
      case CoffeeScriptPackage.PARAM: return createParam();
      case CoffeeScriptPackage.NUMBER_LITERAL: return createNumberLiteral();
      case CoffeeScriptPackage.STRING_LITERAL: return createStringLiteral();
      case CoffeeScriptPackage.BOOL_LITERAL: return createBoolLiteral();
      case CoffeeScriptPackage.JS_LITERAL: return createJSLiteral();
      case CoffeeScriptPackage.REGEX_LITERAL: return createRegexLiteral();
      case CoffeeScriptPackage.LITERAL: return createLiteral();
      case CoffeeScriptPackage.PARENTHETICAL: return createParenthetical();
      case CoffeeScriptPackage.IF: return createIf();
      case CoffeeScriptPackage.FOR: return createFor();
      case CoffeeScriptPackage.WHILE: return createWhile();
      case CoffeeScriptPackage.UNTIL: return createUntil();
      case CoffeeScriptPackage.BINARY_EXP: return createBinaryExp();
      case CoffeeScriptPackage.SUPER_CALL: return createSuperCall();
      case CoffeeScriptPackage.THIS_ALONE: return createThisAlone();
      case CoffeeScriptPackage.LOOP: return createLoop();
      case CoffeeScriptPackage.TRY_CATCH: return createTryCatch();
      case CoffeeScriptPackage.SWITCH: return createSwitch();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Root createRoot()
  {
    RootImpl root = new RootImpl();
    return root;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Body createBody()
  {
    BodyImpl body = new BodyImpl();
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Line createLine()
  {
    LineImpl line = new LineImpl();
    return line;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stmt createStmt()
  {
    StmtImpl stmt = new StmtImpl();
    return stmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Comment createComment()
  {
    CommentImpl comment = new CommentImpl();
    return comment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequireStmt createRequireStmt()
  {
    RequireStmtImpl requireStmt = new RequireStmtImpl();
    return requireStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReturnStmt createReturnStmt()
  {
    ReturnStmtImpl returnStmt = new ReturnStmtImpl();
    return returnStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ThrowStmt createThrowStmt()
  {
    ThrowStmtImpl throwStmt = new ThrowStmtImpl();
    return throwStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SuperClass createSuperClass()
  {
    SuperClassImpl superClass = new SuperClassImpl();
    return superClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassDeclaration createClassDeclaration()
  {
    ClassDeclarationImpl classDeclaration = new ClassDeclarationImpl();
    return classDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssignedClassDeclaration createAssignedClassDeclaration()
  {
    AssignedClassDeclarationImpl assignedClassDeclaration = new AssignedClassDeclarationImpl();
    return assignedClassDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForValue createForValue()
  {
    ForValueImpl forValue = new ForValueImpl();
    return forValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForSource createForSource()
  {
    ForSourceImpl forSource = new ForSourceImpl();
    return forSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Range createRange()
  {
    RangeImpl range = new RangeImpl();
    return range;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Application createApplication()
  {
    ApplicationImpl application = new ApplicationImpl();
    return application;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureCall createFeatureCall()
  {
    FeatureCallImpl featureCall = new FeatureCallImpl();
    return featureCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionCall createFunctionCall()
  {
    FunctionCallImpl functionCall = new FunctionCallImpl();
    return functionCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyAccess createPropertyAccess()
  {
    PropertyAccessImpl propertyAccess = new PropertyAccessImpl();
    return propertyAccess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ThisProperty createThisProperty()
  {
    ThisPropertyImpl thisProperty = new ThisPropertyImpl();
    return thisProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedPropertyAccess createNamedPropertyAccess()
  {
    NamedPropertyAccessImpl namedPropertyAccess = new NamedPropertyAccessImpl();
    return namedPropertyAccess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IndexedPropertyAccess createIndexedPropertyAccess()
  {
    IndexedPropertyAccessImpl indexedPropertyAccess = new IndexedPropertyAccessImpl();
    return indexedPropertyAccess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Index createIndex()
  {
    IndexImpl index = new IndexImpl();
    return index;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimaryExpression createPrimaryExpression()
  {
    PrimaryExpressionImpl primaryExpression = new PrimaryExpressionImpl();
    return primaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block createBlock()
  {
    BlockImpl block = new BlockImpl();
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Case createCase()
  {
    CaseImpl case_ = new CaseImpl();
    return case_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfExp createIfExp()
  {
    IfExpImpl ifExp = new IfExpImpl();
    return ifExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CondBlock createCondBlock()
  {
    CondBlockImpl condBlock = new CondBlockImpl();
    return condBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdRef createIdRef()
  {
    IdRefImpl idRef = new IdRefImpl();
    return idRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Id createId()
  {
    IdImpl id = new IdImpl();
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property createProperty()
  {
    PropertyImpl property = new PropertyImpl();
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssignableArray createAssignableArray()
  {
    AssignableArrayImpl assignableArray = new AssignableArrayImpl();
    return assignableArray;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssignableArgList createAssignableArgList()
  {
    AssignableArgListImpl assignableArgList = new AssignableArgListImpl();
    return assignableArgList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssignableArg createAssignableArg()
  {
    AssignableArgImpl assignableArg = new AssignableArgImpl();
    return assignableArg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assignable createAssignable()
  {
    AssignableImpl assignable = new AssignableImpl();
    return assignable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Arg createArg()
  {
    ArgImpl arg = new ArgImpl();
    return arg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArgLine createArgLine()
  {
    ArgLineImpl argLine = new ArgLineImpl();
    return argLine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExplicitArgList createExplicitArgList()
  {
    ExplicitArgListImpl explicitArgList = new ExplicitArgListImpl();
    return explicitArgList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArgList createArgList()
  {
    ArgListImpl argList = new ArgListImpl();
    return argList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Array createArray()
  {
    ArrayImpl array = new ArrayImpl();
    return array;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dictionary createDictionary()
  {
    DictionaryImpl dictionary = new DictionaryImpl();
    return dictionary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DictItems createDictItems()
  {
    DictItemsImpl dictItems = new DictItemsImpl();
    return dictItems;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExplicitDictItems createExplicitDictItems()
  {
    ExplicitDictItemsImpl explicitDictItems = new ExplicitDictItemsImpl();
    return explicitDictItems;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DictLine createDictLine()
  {
    DictLineImpl dictLine = new DictLineImpl();
    return dictLine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DictItem createDictItem()
  {
    DictItemImpl dictItem = new DictItemImpl();
    return dictItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DictKey createDictKey()
  {
    DictKeyImpl dictKey = new DictKeyImpl();
    return dictKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Lambda createLambda()
  {
    LambdaImpl lambda = new LambdaImpl();
    return lambda;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Param createParam()
  {
    ParamImpl param = new ParamImpl();
    return param;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberLiteral createNumberLiteral()
  {
    NumberLiteralImpl numberLiteral = new NumberLiteralImpl();
    return numberLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoolLiteral createBoolLiteral()
  {
    BoolLiteralImpl boolLiteral = new BoolLiteralImpl();
    return boolLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JSLiteral createJSLiteral()
  {
    JSLiteralImpl jsLiteral = new JSLiteralImpl();
    return jsLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RegexLiteral createRegexLiteral()
  {
    RegexLiteralImpl regexLiteral = new RegexLiteralImpl();
    return regexLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parenthetical createParenthetical()
  {
    ParentheticalImpl parenthetical = new ParentheticalImpl();
    return parenthetical;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public If createIf()
  {
    IfImpl if_ = new IfImpl();
    return if_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public For createFor()
  {
    ForImpl for_ = new ForImpl();
    return for_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public While createWhile()
  {
    WhileImpl while_ = new WhileImpl();
    return while_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Until createUntil()
  {
    UntilImpl until = new UntilImpl();
    return until;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryExp createBinaryExp()
  {
    BinaryExpImpl binaryExp = new BinaryExpImpl();
    return binaryExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SuperCall createSuperCall()
  {
    SuperCallImpl superCall = new SuperCallImpl();
    return superCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ThisAlone createThisAlone()
  {
    ThisAloneImpl thisAlone = new ThisAloneImpl();
    return thisAlone;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Loop createLoop()
  {
    LoopImpl loop = new LoopImpl();
    return loop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TryCatch createTryCatch()
  {
    TryCatchImpl tryCatch = new TryCatchImpl();
    return tryCatch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Switch createSwitch()
  {
    SwitchImpl switch_ = new SwitchImpl();
    return switch_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CoffeeScriptPackage getCoffeeScriptPackage()
  {
    return (CoffeeScriptPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static CoffeeScriptPackage getPackage()
  {
    return CoffeeScriptPackage.eINSTANCE;
  }

} //CoffeeScriptFactoryImpl
