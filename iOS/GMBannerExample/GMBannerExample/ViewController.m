//
//  ViewController.m
//  GMBannerExample
//
//  Created by Deniz H.A, husec19@gmail.com, on 1/15/2014.
//
//  Copyright (c) 2014 GrowMob. All rights reserved.
//

#import "ViewController.h"

#import "GMBannerView.h"

BOOL GMBanner_Pos = GMBANNER_TOP;

@interface ViewController ()
@end

@implementation ViewController

- (void)viewDidLoad
{
    [super viewDidLoad];
    
    _gmBanner = [[GMBannerView alloc] init];
    
    // delegate for server notifications
    _gmBanner.delegate = self;
    
    // assign publisher ad unit ID
    _gmBanner.pubAdUnitID = @"cb48c94121ed203573e27ff087bd2771";
    
    [[self view] addSubview:_gmBanner];
    
    // fetch ads from growmob ads network
    [_gmBanner fetchAd];
}

// ***** radix iOS sdk delegate callback
- (void) viewDidFetchAd:(GMBannerView *)adView {
    NSLog(@"Fetched ad from growmob.heroku.com successfully");
}

- (void)dealloc {
    _gmBanner.delegate = nil;
}

- (NSUInteger)supportedInterfaceOrientations {
    return UIInterfaceOrientationMaskPortrait;
}

- (void)didReceiveMemoryWarning
{
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}

@end
