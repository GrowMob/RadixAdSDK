/*
 * Copyright (C) 2014 GrowMob Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/* 
 * @author Deniz H.A
 * @email husec19@gmail.com
 */

package com.example.growmobsample;

import com.growmob.api.gmAdView;

import android.os.Bundle;
import android.os.StrictMode;
import android.app.Activity;
import android.widget.RelativeLayout;

public class MainActivity extends Activity {
		
	int x = 123;
	
	public RelativeLayout mainLayout;	
	
	// GrowMob gmAdView object declaration and Ad Unit ID definition  
   	public static gmAdView adView;
   	public static final String AD_UNIT_ID = "cb48c94121ed203573e27ff087bd2771";

   	@Override
	protected void onCreate(Bundle savedInstanceState) {		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		if (android.os.Build.VERSION.SDK_INT > 9) {
		      StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
		      StrictMode.setThreadPolicy(policy);
		}
		
		mainLayout = (RelativeLayout) findViewById(R.id.mainlayout);

        // GrowMob Ad View object
        adView = new gmAdView(this, AD_UNIT_ID, gmAdView.TOP);
        
        // for test location fill in the order of city, state if any or null and country
        // ** remove this line for GPS service on the real device    
        adView.addTestLocation("Vancouver", "BC", "Canada");
                        
	    //Add the adView to it
	    mainLayout.addView(adView);        
}
    
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
}        