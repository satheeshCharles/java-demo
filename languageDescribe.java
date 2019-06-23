class applicationDesign{
	int setLanguage ( int language ) {
		if (language > 0 ) {
			System.out.println(" You are rading java" ) ;
			return 42;
		}
		else {
			System.out.println(" You are not reading anyting" );
		}
		
	}
}

class languageDescribe {
	public static void main ( String args []) {
		applicationDesign ad = new applicationDesign();
		ad.setLanguage(2);
	}
}
