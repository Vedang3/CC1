package CalculatorApp;


/**
* CalculatorApp/CalculatorPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Calculator.idl
* Sunday, May 21, 2023 5:20:11 PM IST
*/

public abstract class CalculatorPOA extends org.omg.PortableServer.Servant
 implements CalculatorApp.CalculatorOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("add", new java.lang.Integer (0));
    _methods.put ("subtract", new java.lang.Integer (1));
    _methods.put ("multiply", new java.lang.Integer (2));
    _methods.put ("divide", new java.lang.Integer (3));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // CalculatorApp/Calculator/add
       {
         int num1 = in.read_long ();
         int num2 = in.read_long ();
         int $result = (int)0;
         $result = this.add (num1, num2);
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 1:  // CalculatorApp/Calculator/subtract
       {
         int num1 = in.read_long ();
         int num2 = in.read_long ();
         int $result = (int)0;
         $result = this.subtract (num1, num2);
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 2:  // CalculatorApp/Calculator/multiply
       {
         int num1 = in.read_long ();
         int num2 = in.read_long ();
         int $result = (int)0;
         $result = this.multiply (num1, num2);
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 3:  // CalculatorApp/Calculator/divide
       {
         try {
           int num1 = in.read_long ();
           int num2 = in.read_long ();
           double $result = (double)0;
           $result = this.divide (num1, num2);
           out = $rh.createReply();
           out.write_double ($result);
         } catch (CalculatorApp.DivideByZero $ex) {
           out = $rh.createExceptionReply ();
           CalculatorApp.DivideByZeroHelper.write (out, $ex);
         }
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:CalculatorApp/Calculator:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Calculator _this() 
  {
    return CalculatorHelper.narrow(
    super._this_object());
  }

  public Calculator _this(org.omg.CORBA.ORB orb) 
  {
    return CalculatorHelper.narrow(
    super._this_object(orb));
  }


} // class CalculatorPOA
