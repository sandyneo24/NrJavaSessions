package naveenAutomation.automationTraining;

public class XpathGenerationClass {
	
	//input[@id="{0}"]
	public static String createXpath(String xpathExp, Object ...args)
	{
		for(int i=0;i<args.length;i++)
		{
			xpathExp = xpathExp.replace("{"+i+"}", (CharSequence) args[i]);
		}
		return xpathExp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x1=createXpath("//input[@id='{0}']", "test");
		System.out.println(x1);
	}

}
