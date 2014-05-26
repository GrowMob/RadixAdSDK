Radix Ad SDK Android-BannerSample
====================

HOW TO USE Radix Ad SDK for Android: 

Go to https://growmob.heroku.com to sign in.. 

First, you need to add libradixandroid.jar into the libs folder of your Android project from Android->RadixAdSDK->libradixandroid.jar

1.  Put the following variable declarations in the main activity and replace the ad_unit_id (slot) with your own,

      public static gmAdView adView;
      
      public static final String AD_UNIT_ID = "cb48c94121ed203573e27ff087bd2771";  

2. Put the following code in OnCreate 

    mainLayout = (RelativeLayout) findViewById(R.id.mainlayout);

     // GrowMob Ad View object
     adView = new gmAdView(this, AD_UNIT_ID, gmAdView.TOP);
        
     // for test location fill in the order of city, state if any or null and country
     // remove this line for GPS service on the real device   
     adView.addTestLocation("Vancouver", "BC", "Canada");

	//Add the adView to it
	mainLayout.addView(adView);      

3. Put the following code into the Main Activity class

    @Override
  	protected void onStart() {
      	super.onStart();     
 	
	      adView.fetchAd();      	
      }
       
    @Override
  	protected void onStop() {
      	super.onStop();

      	adView.freeAd();
      }
      
      protected void OnDestroy() {
        super.onDestroy();    
       
        adView.destroy();         
      }

4. Add the following definitions into the manifest file properly.. 

  <activity
            android:name="com.growmob.api.WebViewActivity"
            android:theme="@android:style/Theme.NoTitleBar"
            android:configChanges="keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize"> 

   <uses-permission android:name="android.permission.INTERNET">

5. Add the libradixandroid.jar into the “libs” folder of your android application project from RadixAdSDK under Android folder.. 

 That’s it! Run your code and it will start to fetch ads from GrowMob network immediately.. 

Please check the MainActivity.java for the full sample code.. 

You can also install the signed sample APK found in SignedSampleAPK folder (GPS enabled) to your Android device..

