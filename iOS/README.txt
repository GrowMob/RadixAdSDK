Radix Ad SDK iOS-BannerSample
====================

After downloading and clicking on the GMBannerExample.xcodeproj to open the sample project, you may need to fix the search paths.. 

Please follow the instructions explained below:

1. add “RadixAdSDK” directory to your project under iOS (search path will be included automatically by Xcode),

2. add #import "GMBannerView.h" to your view controller, 

3. add $USER_ROOT/include to your search library path (click on Targets->GMBannerExample->Search Patch->Library Search Paths)

4. clean and build the project before run it.. 

5. if you are working it on the iOS simulator, do not forget to simulate the location by activating it through debug->location->custom location.. you can also add your own location .gpx files for the campaigns created by yourself for a specific location.. 



 
