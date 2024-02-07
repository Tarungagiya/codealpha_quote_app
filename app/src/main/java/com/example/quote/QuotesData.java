package com.example.quote;

import java.util.ArrayList;
import java.util.List;

public class QuotesData {

    public static List<QuoteLists> getQuoteLists() {

        final List<QuoteLists> quoteLists1 = new ArrayList<>();

        QuoteLists quote1 = new QuoteLists("The best and most beautiful things in the world cannot be seen or even touched - they must be felt with the heart.","Helen Keller");
        quoteLists1.add(quote1);

        QuoteLists quote2 = new QuoteLists("Do not go where the path may lead, go instead where there is no path and leave a trail.","Ralph Waldo Emerson");
        quoteLists1.add(quote2);

        QuoteLists quote3 = new QuoteLists("Darkness cannot drive out darkness: only light can do that. Hate cannot drive out hate: only love can do that.","Martin Luther King Jr");
        quoteLists1.add(quote3);

        QuoteLists quote4 = new QuoteLists("Spread love everywhere you go. Let no one ever come to you without leaving happier. ","Mother Teresa");
        quoteLists1.add(quote4);

        QuoteLists quote5 = new QuoteLists("Many of life’s failures are people who did not realize how close they were to success when they gave up.","Thomas A. Edison");
        quoteLists1.add(quote5);

        QuoteLists quote6 = new QuoteLists("Money and success don’t change people; they merely amplify what is already there.","Will Smith");
        quoteLists1.add(quote6);

        QuoteLists quote7 = new QuoteLists("Your time is limited, so don’t waste it living someone else’s life. Don’t be trapped by dogma – which is living with the results of other people’s thinking.","Steve Jobs");
        quoteLists1.add(quote7);

        return quoteLists1;
    }
}
