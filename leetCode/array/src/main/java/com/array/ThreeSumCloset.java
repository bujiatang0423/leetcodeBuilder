package com.array;

import java.util.Arrays;

public class ThreeSumCloset {
    public static void main(String[] args) {

        final int[] ints = new int[]{321,413,82,812,-646,-858,729,609,-339,483,-33,
                -399,-82,-455,18,661,890,-328,-311,520,-865,-174,55,685,-636,462,-172,-696,-296,
                -832,766,-808,-763,853,482,411,703,655,-793,-121,-726,105,-966,-471,612,551,-257,836,
                -94,-213,511,317,-293,279,-571,242,-519,386,-670,-806,-612,-433,-481,794,712,378,-325,
                -564,477,169,601,971,-300,-431,-152,285,-899,978,-419,708,536,-816,-335,284,384,-922,
                -941,633,934,497,-351,62,392,-493,-44,-400,646,-912,-864,835,713,-12,322,-228,340,-42,
                -307,-580,-802,-914,-142,575,-684,-415,718,-579,759,579,732,-645,525,114,-880,-603,-699,-101,
                -738,-887,327,192,747,-614,393,97,-569,160,782,-69,235,-598,-116,928,-805,-76,-521,671,417,600,
                -442,236,831,637,-562,613,-705,-158,-237,-299,808,-734,364,919,251,-163,-343,899};
        final int i = threeSumClosest(ints, 2218);
        System.out.println(i);


    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int add = nums[0]+nums[1]+nums[2];;
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k =  nums.length-1;
            int sum = Math.abs(add-target);

            while (j<k){
                int count  = nums[i]+nums[j]+nums[k];
                int abs = Math.abs(count-target);
                if (count==target){
                    return count;
                }

                if(abs<sum){
                    sum = abs;
                    add = count;
                }

                if(count<target){
                    j++;
                }else {
                    k--;
                }
            }
        }
        return add;
    }
}
