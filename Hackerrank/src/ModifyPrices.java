import java.util.HashMap;

/**
 * Created by shubham.goyal on 1/20/17.
 */
public class ModifyPrices {

    static int verifyItems(String[] origItems, float[] origPrices, String[] items, float[] prices) {

        HashMap<String, Float> originalMap = new HashMap<>();
        for(int i = 0; i < origItems.length; i++) {
            originalMap.put(origItems[i], origPrices[i]);
        }

        int result = 0;
        for(int i = 0; i < items.length; i++) {
            float originalPrice = originalMap.get(items[i]);
            if(originalPrice != prices[i]){
                result++;
            }
        }

        return result;
    }
}
