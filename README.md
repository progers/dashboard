# Dashboard

This is a simple smart mirror built from:

1. An Android phone, [Nexus 5X](https://en.wikipedia.org/wiki/Nexus_5X).

2. A weather/time webpage, [index.html](https://pr.gg/dashboard).

3. An app to show the webpage, [app/Dashboard](app/Dashboard).

4. A acryllic 2-way mirror from [TAP plastics](http://www.tapplastics.com/product/plastics/cut_to_size_plastic/two_way_mirrored_acrylic/558). (30cm*60cm out of the surplus bin, $30)

5. Black [construction paper](https://www.amazon.com/gp/product/B00563PXHQ), taped behind the mirror for an even background.

!["https://pr.gg/finished.jpg"](https://pr.gg/finished.jpg)

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

* The Nexus 5X's IPS LCD panel seems happy to display a static page without burn-in or heat issues. I did a test of a static image at max brightness for a week and couldn't notice an issue.
