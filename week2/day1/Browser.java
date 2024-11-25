package week2.day1;

public class Browser {
	
	public String launchBrowser(String browserName) {
		System.out.println("Browser launched successfully");
		return browserName;
	}
	
	public void loadUrl() {
		System.out.println("Application URL loaded successfully");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser browserObject=new Browser();
		browserObject.launchBrowser("IE");
		browserObject.loadUrl();

	}

}
