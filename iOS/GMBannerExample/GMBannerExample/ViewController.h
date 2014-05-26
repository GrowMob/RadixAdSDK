//
//  ViewController.h
//  GMBannerExample
//
//  Created by Deniz H.A, husec19@gmail.com, on 1/15/2014.
//
//  Copyright (c) 2014 GrowMob. All rights reserved.
//


#import <UIKit/UIKit.h>

#import "GMBannerView.h"
#import "GMBannerViewDelegate.h"

@interface ViewController : UIViewController <GMBannerViewDelegate>
@property(nonatomic, strong) GMBannerView *gmBanner;
@end
