# Dashboard
A homemade smart mirror.

## New mirror (version 2)
The first mirror was on my wall a full year and got used every day. There were two issues I wanted to fix when building a new mirror:
1. Deeper blacks.
The original screen was an IPS LCD gave off a faint glow if the room was dark. An AMOLED screen would be better.
2. Glass mirror.
Plexiglass 2-way mirrors are wavy and don't work well as a dressing mirror. Plexiglass also shouldn't be cleaned with ammonia (Windex).

Here's what I used to build the new mirror:
1. An Android tablet, [Galaxy Tab S2](https://en.wikipedia.org/wiki/Samsung_Galaxy_Tab_S2_8.0).
This has an AMOLED display which has much deeper blacks.
2. An upgraded weather/time webpage, [index.html](https://pr.gg/dashboard).
This now displays the current weather and the forecast in ~10 hours. This is more useful day-to-day (e.g., when getting ready in the morning) than a 2-day high/low.
3. An app to show the webpage, [app/Dashboard](app/Dashboard).
4. A 16" x 48" glass two-way mirror from [twowaymirrors.com](https://www.twowaymirrors.com) ($250).
5. A 16" x 48" OEM2-21 frame from [framing4yourself.com](https://framing4yourself.com/shop/products/custom-sectional-metal-frames/black-metal-oem2-21-flatmatte-1332-wide) ($63).
6. Black foam board from Blick art supply ($10).
7. Black [construction paper](https://www.amazon.com/gp/product/B00563PXHQ), taped behind the mirror for an even background.

<img src="https://pr.gg/dashboard/version2_b_1024.jpg?nocache" width="300"> <img src="https://pr.gg/dashboard/version2_a_1024.jpg?nocache" width="300">

## Original mirror (version 1)
This was a smart mirror built from:

1. An Android phone, [Nexus 5X](https://en.wikipedia.org/wiki/Nexus_5X).

2. A weather/time webpage, [index.html](https://pr.gg/dashboard).

3. An app to show the webpage, [app/Dashboard](app/Dashboard).

4. A acrylic 2-way mirror from [TAP plastics](http://www.tapplastics.com/product/plastics/cut_to_size_plastic/two_way_mirrored_acrylic/558). (30cm x 60cm out of the surplus bin, $30)

5. Black [construction paper](https://www.amazon.com/gp/product/B00563PXHQ), taped behind the mirror for an even background.

![](https://pr.gg/dashboard/finished.jpg)

Credit to [Becky Stern](https://learn.adafruit.com/android-smart-home-mirror)'s article for the idea.

# Interesting findings

* There are not many good examples of how to print English ordinals (1**st**, 2**nd**, etc). Here's a nice way to print ordinals in javascript:
    ```javascript
    // Return the English ordinal for a number.
    function ordinal(number) {
        // The general pattern:
        //   number ends in 1 -> st (e.g., 31st)
        //   number ends in 2 -> nd (e.g., 32nd)
        //   number ends in 3 -> rd (e.g., 33rd)
        // 11, 12, and 13 are exceptions and just use 'th'.
        switch(number % 10) {
            case(1): if (number % 100 == 11) { break; } else { return 'st' };
            case(2): if (number % 100 == 12) { break; } else { return 'nd' };
            case(3): if (number % 100 == 13) { break; } else { return 'rd' };
        }
        return 'th';
    }
    ```

* The front-facing camera, [now taped over](http://www.npr.org/sections/thetwo-way/2016/04/08/473548674/why-the-fbi-director-puts-tape-over-his-webcam), works well from behind the mirror. This could be useful as an art display (maybe an [infinite mirror](https://en.wikipedia.org/wiki/Infinity_mirror#/media/File:Infinity_Mirror.png)) that responds to the environment.

* The Nexus 5X's IPS LCD panel seems happy to display a static page without burn-in or heat issues. Before starting the project I did a test of a static image at max brightness for a week and couldn't notice any problems. After 1 year of continuous use, the Nexus 5X's screen still looks brand new.
