public class Variable{
    /*Instance variable */
    /*Will need object to acess this variable */

    int instanceVariable = 100;
    /*Static/Class variable 
     * No need of object, can be called from class
     * Sharaed between the objects
    */
    static int staticVariable = 20;



    public static void main(String[] args){

/*Non Primitive data types */
/*Declarative */
byte byteValue;
/*Initialization */
byteValue = 100;
/* Declaration and Initialization */
short shortValue = 200;
/*Multiple declaration  */
int intValue1,intValue2;
intValue = 10000;
intValue2 = 20000;
/*Multiple declaration and initialization */
long longVal1 = -9000,longVal2 = 9000;
float floatValue = 90,90f;// the letter 'f' is needed
double doubleValue = 100.897d // the letter 'd' is optional
char charValue = 'c';//must use singhle quote
boolean booleanValue = false;
/*Illegal action below */
//byte byteValue = 100 // we cannot redeclare the variable
// byteValue = 200;// instead use reassignment
// boolean boolVal2 = 'false'; // cannot use different types
// byte byteValue2 =1000000000000; // cannot exceed min and max

/*  Non primitive data types */
String stringValue = "This is a string value";
/*Using class */
String stringValue2 = new String(original:"This string uses class");
System.out.println(stringValue2);
/*Object ,for this we can use the same public class made */
Variable variableObject = new Variable();
/*Use object from above to acess instance variable */
System.out.println(Variable.staticVariable);

/*Type Casting */
int intValueType = 100;
double intValueConvertedToDouble = intValueType;
/*Automatically cast from low datatype to high datatype */

/*Explicit Casting */
double doubleValueType = 190.8109;
int doubleValueConvertedToInt = (int) doubleValue;
/*Manually specify data type for eg.(int) */
/*Note this tyoe cast can only be done in primitive data type */

/*Task
 * Make one double variable called doubleVar1 = 1000.12
 * Explicitly cast the variable into float.floatVar1
 * Explicitly cast the floatVar1 into int ,intVar1
 * make a string variable with " The integer is"
 * Print he String variable and print the int variable in another
 
 */
double doubleVar1 = 1000.12d;
float floatVar1 = (float)doubleVar1
int intValue1 = (int) floatVae1;
String info = "The integer is":
System.out.println(info);
System.out.println(intVar1);


    }
}




