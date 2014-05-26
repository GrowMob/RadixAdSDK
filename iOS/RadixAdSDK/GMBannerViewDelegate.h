//
//  GMBannerViewDelegate.h
//  iOSSDK
//
//  Created by Deniz H.A, husec19@gmail.com, on 1/15/2014.
//
//  Copyright (c) 2014 GrowMob. All rights reserved.
//

#import <Foundation/Foundation.h>
@class GMBannerView;

@protocol GMBannerViewDelegate <NSObject>
- (void) viewDidFetchAd:(GMBannerView *) view;
@end
