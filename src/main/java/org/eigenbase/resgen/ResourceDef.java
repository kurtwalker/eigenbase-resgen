/*
// This java file was automatically generated
// from XOM model 'resource'
// on Tue Jul 17 18:03:58 PDT 2012
// Do not edit this file by hand.
*/

package org.eigenbase.resgen;
/**
 * This model specifies the elements which make up a resource file. See
 * {@link ResourceGenTask} for more information.
 * <p>This class was generated from XOM model 'resource' on Tue Jul 17 18:03:58 PDT 2012
 */
public class ResourceDef {

	public static java.lang.Class getXMLDefClass()
	{
		return ResourceDef.class;
	}

	public static String[] _elements = {
		"resourceBundle",
		"Code",
		"resource",
		"message",
		"text",
		"exception",
		"property"
	};

	/**
	 * A ResourceBundle is a collection of resources.
	 * The resource generator generates a class from a resource bundle
	 * which has an accessor method for each resource.
	 */
	public static class ResourceBundle extends org.eigenbase.xom.ElementDef
	{
		public ResourceBundle()
		{
		}

		public ResourceBundle(org.eigenbase.xom.DOMWrapper _def)
			throws org.eigenbase.xom.XOMException
		{
			try {
				org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", ResourceDef.class);
				org.eigenbase.xom.NodeDef[] _tempArray;
				locale = (String)_parser.getAttribute("locale", "String", null, null, true);
				exceptionClassName = (String)_parser.getAttribute("exceptionClassName", "String", null, null, false);
				cppNamespace = (String)_parser.getAttribute("cppNamespace", "String", null, null, false);
				cppCommonInclude = (String)_parser.getAttribute("cppCommonInclude", "String", null, null, false);
				cppExceptionClassName = (String)_parser.getAttribute("cppExceptionClassName", "String", null, null, false);
				cppExceptionClassLocation = (String)_parser.getAttribute("cppExceptionClassLocation", "String", null, null, false);
				_tempArray = _parser.getArray(Resource.class, 0, 0);
				resources = new Resource[_tempArray.length];
				for (int _i = 0; _i < resources.length; _i++)
					resources[_i] = (Resource)_tempArray[_i];
				code = (Code)_parser.getElement(Code.class, false);
			} catch(org.eigenbase.xom.XOMException _ex) {
				throw new org.eigenbase.xom.XOMException("In " + getName() + ": " + _ex.getMessage());
			}
		}

		public String locale;  // required attribute
		public String exceptionClassName;  // optional attribute
		public String cppNamespace;  // optional attribute
		public String cppCommonInclude;  // optional attribute
		public String cppExceptionClassName;  // optional attribute
		public String cppExceptionClassLocation;  // optional attribute

		public Resource[] resources;  //optional array
		/**
		 * Text within this element is included in the generated class.
		 */
		public Code code;  //optional element

		public String getName()
		{
			return "ResourceBundle";
		}

		public void display(java.io.PrintWriter _out, int _indent)
		{
			_out.println(getName());
			displayAttribute(_out, "locale", locale, _indent+1);
			displayAttribute(_out, "exceptionClassName", exceptionClassName, _indent+1);
			displayAttribute(_out, "cppNamespace", cppNamespace, _indent+1);
			displayAttribute(_out, "cppCommonInclude", cppCommonInclude, _indent+1);
			displayAttribute(_out, "cppExceptionClassName", cppExceptionClassName, _indent+1);
			displayAttribute(_out, "cppExceptionClassLocation", cppExceptionClassLocation, _indent+1);
			displayElementArray(_out, "resources", resources, _indent+1);
			displayElement(_out, "code", (org.eigenbase.xom.ElementDef) code, _indent+1);
		}
		public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
		{
			_out.beginTag("resourceBundle", new org.eigenbase.xom.XMLAttrVector()
				.add("locale", locale)
				.add("exceptionClassName", exceptionClassName)
				.add("cppNamespace", cppNamespace)
				.add("cppCommonInclude", cppCommonInclude)
				.add("cppExceptionClassName", cppExceptionClassName)
				.add("cppExceptionClassLocation", cppExceptionClassLocation)
				);
			displayXMLElementArray(_out, resources);
			displayXMLElement(_out, (org.eigenbase.xom.ElementDef) code);
			_out.endTag("resourceBundle");
		}
		public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
		{
			ResourceBundle _cother = (ResourceBundle)_other;
			boolean _diff = displayAttributeDiff("locale", locale, _cother.locale, _out, _indent+1);
			_diff = _diff && displayAttributeDiff("exceptionClassName", exceptionClassName, _cother.exceptionClassName, _out, _indent+1);
			_diff = _diff && displayAttributeDiff("cppNamespace", cppNamespace, _cother.cppNamespace, _out, _indent+1);
			_diff = _diff && displayAttributeDiff("cppCommonInclude", cppCommonInclude, _cother.cppCommonInclude, _out, _indent+1);
			_diff = _diff && displayAttributeDiff("cppExceptionClassName", cppExceptionClassName, _cother.cppExceptionClassName, _out, _indent+1);
			_diff = _diff && displayAttributeDiff("cppExceptionClassLocation", cppExceptionClassLocation, _cother.cppExceptionClassLocation, _out, _indent+1);
			_diff = _diff && displayElementArrayDiff("resources", resources, _cother.resources, _out, _indent+1);
			_diff = _diff && displayElementDiff("code", code, _cother.code, _out, _indent+1);
			return _diff;
		}
	}

	public static class Code extends org.eigenbase.xom.ElementDef
	{
		public Code()
		{
		}

		public Code(org.eigenbase.xom.DOMWrapper _def)
			throws org.eigenbase.xom.XOMException
		{
			try {
				org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", ResourceDef.class);
				cdata = _parser.getText();
			} catch(org.eigenbase.xom.XOMException _ex) {
				throw new org.eigenbase.xom.XOMException("In " + getName() + ": " + _ex.getMessage());
			}
		}


		public String cdata;  // All text goes here
		public String getName()
		{
			return "Code";
		}

		public void display(java.io.PrintWriter _out, int _indent)
		{
			_out.println(getName());
			displayString(_out, "cdata", cdata, _indent+1);
		}
		public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
		{
			_out.beginTag("Code", new org.eigenbase.xom.XMLAttrVector()
				);
			_out.cdata(cdata);
			_out.endTag("Code");
		}
		public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
		{
			Code _cother = (Code)_other;
			boolean _diff = displayStringDiff("cdata", cdata, _cother.cdata, _out, _indent+1);
			return _diff;
		}
	}

	public static abstract class Resource extends org.eigenbase.xom.ElementDef
	{
		public Resource()
		{
		}

		public Resource(org.eigenbase.xom.DOMWrapper _def)
			throws org.eigenbase.xom.XOMException
		{
			this._def = _def;
			try {
				org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", ResourceDef.class);
				org.eigenbase.xom.NodeDef[] _tempArray;
				name = (String)_parser.getAttribute("name", "String", null, null, true);
				_tempArray = _parser.getArray(Property.class, 0, 0);
				properties = new Property[_tempArray.length];
				for (int _i = 0; _i < properties.length; _i++)
					properties[_i] = (Property)_tempArray[_i];
				text = (Text)_parser.getElement(Text.class, false);
			} catch(org.eigenbase.xom.XOMException _ex) {
				throw new org.eigenbase.xom.XOMException("In " + getName() + ": " + _ex.getMessage());
			}
		}

		public String name;  // required attribute
		public org.eigenbase.xom.DOMWrapper _def;

		public Property[] properties;  //optional array
		public Text text;  //optional element

		public String getName()
		{
			return "Resource";
		}

		public void display(java.io.PrintWriter _out, int _indent)
		{
			_out.println(getName());
			displayAttribute(_out, "name", name, _indent+1);
			displayElementArray(_out, "properties", properties, _indent+1);
			displayElement(_out, "text", (org.eigenbase.xom.ElementDef) text, _indent+1);
		}
		public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
		{
			_out.beginTag("resource", new org.eigenbase.xom.XMLAttrVector()
				.add("name", name)
				);
			displayXMLElementArray(_out, properties);
			displayXMLElement(_out, (org.eigenbase.xom.ElementDef) text);
			_out.endTag("resource");
		}
		public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
		{
			Resource _cother = (Resource)_other;
			boolean _diff = displayAttributeDiff("name", name, _cother.name, _out, _indent+1);
			_diff = _diff && displayElementArrayDiff("properties", properties, _cother.properties, _out, _indent+1);
			_diff = _diff && displayElementDiff("text", text, _cother.text, _out, _indent+1);
			return _diff;
		}
		// BEGIN pass-through code block ---
abstract org.eigenbase.xom.DOMWrapper getDef();
		// END pass-through code block ---
	}

	/**
	 * A message.
	 */
	public static class Message extends Resource
	{
		public Message()
		{
		}

		public Message(org.eigenbase.xom.DOMWrapper _def)
			throws org.eigenbase.xom.XOMException
		{
			this._def = _def;
			try {
				org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", ResourceDef.class);
				org.eigenbase.xom.NodeDef[] _tempArray;
				name = (String)_parser.getAttribute("name", "String", null, null, true);
				_tempArray = _parser.getArray(Property.class, 0, 0);
				properties = new Property[_tempArray.length];
				for (int _i = 0; _i < properties.length; _i++)
					properties[_i] = (Property)_tempArray[_i];
				text = (Text)_parser.getElement(Text.class, false);
			} catch(org.eigenbase.xom.XOMException _ex) {
				throw new org.eigenbase.xom.XOMException("In " + getName() + ": " + _ex.getMessage());
			}
		}

		public org.eigenbase.xom.DOMWrapper _def;


		public String getName()
		{
			return "Message";
		}

		public void display(java.io.PrintWriter _out, int _indent)
		{
			_out.println(getName());
			displayAttribute(_out, "name", name, _indent+1);
			displayElementArray(_out, "properties", properties, _indent+1);
			displayElement(_out, "text", (org.eigenbase.xom.ElementDef) text, _indent+1);
		}
		public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
		{
			_out.beginTag("message", new org.eigenbase.xom.XMLAttrVector()
				.add("name", name)
				);
			displayXMLElementArray(_out, properties);
			displayXMLElement(_out, (org.eigenbase.xom.ElementDef) text);
			_out.endTag("message");
		}
		public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
		{
			Message _cother = (Message)_other;
			boolean _diff = displayElementArrayDiff("properties", properties, _cother.properties, _out, _indent+1);
			_diff = _diff && displayElementDiff("text", text, _cother.text, _out, _indent+1);
			return _diff;
		}
		// BEGIN pass-through code block ---
org.eigenbase.xom.DOMWrapper getDef() { return _def; }
		// END pass-through code block ---
	}

	public static class Text extends org.eigenbase.xom.ElementDef
	{
		public Text()
		{
		}

		public Text(org.eigenbase.xom.DOMWrapper _def)
			throws org.eigenbase.xom.XOMException
		{
			try {
				org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", ResourceDef.class);
				cdata = _parser.getText();
			} catch(org.eigenbase.xom.XOMException _ex) {
				throw new org.eigenbase.xom.XOMException("In " + getName() + ": " + _ex.getMessage());
			}
		}


		public String cdata;  // All text goes here
		public String getName()
		{
			return "Text";
		}

		public void display(java.io.PrintWriter _out, int _indent)
		{
			_out.println(getName());
			displayString(_out, "cdata", cdata, _indent+1);
		}
		public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
		{
			_out.beginTag("text", new org.eigenbase.xom.XMLAttrVector()
				);
			_out.cdata(cdata);
			_out.endTag("text");
		}
		public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
		{
			Text _cother = (Text)_other;
			boolean _diff = displayStringDiff("cdata", cdata, _cother.cdata, _out, _indent+1);
			return _diff;
		}
	}

	/**
	 * An exception defines a message which is issued in response
	 * to some invalid condition. It has a type, which must be derived from
	 * {@link Throwable}. The generated newExceptionName
	 * method creates an instance of this exception with the appropriate
	 * parameters.
	 */
	public static class Exception extends Resource
	{
		public Exception()
		{
		}

		public Exception(org.eigenbase.xom.DOMWrapper _def)
			throws org.eigenbase.xom.XOMException
		{
			this._def = _def;
			try {
				org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", ResourceDef.class);
				org.eigenbase.xom.NodeDef[] _tempArray;
				className = (String)_parser.getAttribute("className", "String", null, null, false);
				cppClassName = (String)_parser.getAttribute("cppClassName", "String", null, null, false);
				cppClassLocation = (String)_parser.getAttribute("cppClassLocation", "String", null, null, false);
				cppChainExceptions = (String)_parser.getAttribute("cppChainExceptions", "String", null, null, false);
				name = (String)_parser.getAttribute("name", "String", null, null, true);
				_tempArray = _parser.getArray(Property.class, 0, 0);
				properties = new Property[_tempArray.length];
				for (int _i = 0; _i < properties.length; _i++)
					properties[_i] = (Property)_tempArray[_i];
				text = (Text)_parser.getElement(Text.class, false);
			} catch(org.eigenbase.xom.XOMException _ex) {
				throw new org.eigenbase.xom.XOMException("In " + getName() + ": " + _ex.getMessage());
			}
		}

		public String className;  // optional attribute
		public String cppClassName;  // optional attribute
		public String cppClassLocation;  // optional attribute
		public String cppChainExceptions;  // optional attribute
		public org.eigenbase.xom.DOMWrapper _def;


		public String getName()
		{
			return "Exception";
		}

		public void display(java.io.PrintWriter _out, int _indent)
		{
			_out.println(getName());
			displayAttribute(_out, "className", className, _indent+1);
			displayAttribute(_out, "cppClassName", cppClassName, _indent+1);
			displayAttribute(_out, "cppClassLocation", cppClassLocation, _indent+1);
			displayAttribute(_out, "cppChainExceptions", cppChainExceptions, _indent+1);
			displayAttribute(_out, "name", name, _indent+1);
			displayElementArray(_out, "properties", properties, _indent+1);
			displayElement(_out, "text", (org.eigenbase.xom.ElementDef) text, _indent+1);
		}
		public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
		{
			_out.beginTag("exception", new org.eigenbase.xom.XMLAttrVector()
				.add("className", className)
				.add("cppClassName", cppClassName)
				.add("cppClassLocation", cppClassLocation)
				.add("cppChainExceptions", cppChainExceptions)
				.add("name", name)
				);
			displayXMLElementArray(_out, properties);
			displayXMLElement(_out, (org.eigenbase.xom.ElementDef) text);
			_out.endTag("exception");
		}
		public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
		{
			Exception _cother = (Exception)_other;
			boolean _diff = displayAttributeDiff("className", className, _cother.className, _out, _indent+1);
			_diff = _diff && displayAttributeDiff("cppClassName", cppClassName, _cother.cppClassName, _out, _indent+1);
			_diff = _diff && displayAttributeDiff("cppClassLocation", cppClassLocation, _cother.cppClassLocation, _out, _indent+1);
			_diff = _diff && displayAttributeDiff("cppChainExceptions", cppChainExceptions, _cother.cppChainExceptions, _out, _indent+1);
			_diff = _diff && displayElementArrayDiff("properties", properties, _cother.properties, _out, _indent+1);
			_diff = _diff && displayElementDiff("text", text, _cother.text, _out, _indent+1);
			return _diff;
		}
		// BEGIN pass-through code block ---
org.eigenbase.xom.DOMWrapper getDef() { return _def; }
		// END pass-through code block ---
	}

	public static class Property extends org.eigenbase.xom.ElementDef
	{
		public Property()
		{
		}

		public Property(org.eigenbase.xom.DOMWrapper _def)
			throws org.eigenbase.xom.XOMException
		{
			try {
				org.eigenbase.xom.DOMElementParser _parser = new org.eigenbase.xom.DOMElementParser(_def, "", ResourceDef.class);
				name = (String)_parser.getAttribute("name", "String", null, null, true);
				cdata = _parser.getText();
			} catch(org.eigenbase.xom.XOMException _ex) {
				throw new org.eigenbase.xom.XOMException("In " + getName() + ": " + _ex.getMessage());
			}
		}

		public String name;  // required attribute

		public String cdata;  // All text goes here
		public String getName()
		{
			return "Property";
		}

		public void display(java.io.PrintWriter _out, int _indent)
		{
			_out.println(getName());
			displayAttribute(_out, "name", name, _indent+1);
			displayString(_out, "cdata", cdata, _indent+1);
		}
		public void displayXML(org.eigenbase.xom.XMLOutput _out, int _indent)
		{
			_out.beginTag("property", new org.eigenbase.xom.XMLAttrVector()
				.add("name", name)
				);
			_out.cdata(cdata);
			_out.endTag("property");
		}
		public boolean displayDiff(org.eigenbase.xom.ElementDef _other, java.io.PrintWriter _out, int _indent)
		{
			Property _cother = (Property)_other;
			boolean _diff = displayAttributeDiff("name", name, _cother.name, _out, _indent+1);
			_diff = _diff && displayStringDiff("cdata", cdata, _cother.cdata, _out, _indent+1);
			return _diff;
		}
	}


}
