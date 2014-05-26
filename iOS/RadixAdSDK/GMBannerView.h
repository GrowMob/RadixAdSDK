//
//  GMBanner.h
//  GMBannerExample
//
//  Created by Deniz H.A, husec19@gmail.com, on 1/15/2014.
//  Copyright (c) 2014 GrowMob. All rights reserved.
//

#import <UIKit/UIKit.h>
#import <CoreLocation/CoreLocation.h>
#import "GMBannerViewDelegate.h"
#define GMBANNER_TOP 0
#define GMBANNER_BOTTOM 1
extern BOOL GMBanner_Pos;

@interface GMBannerView : UIView <CLLocationManagerDelegate>
@property (nonatomic, strong) UILabel *adLabel;
@property (nonatomic, strong) NSString *pubAdUnitID;
@property (nonatomic, strong) NSObject <GMBannerViewDelegate> *delegate;
@property (nonatomic, strong) NSArray *adUnits;

- (void) fetchAd;
- (void) close;
@end
