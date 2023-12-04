package com.epam.rd.autotasks;


class FunctionsTask1 {
    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     * if set invalid arguments in method, then method must throws
     * IllegalArgumentException
     */
    public static boolean isSorted(int[] array, SortOrder order) {
        if (array==null) {
            throw new IllegalArgumentException();
        }
        else if (array.length==0){
            throw new IllegalArgumentException();
        }
        else{
            boolean sorted = true;
            if (order == SortOrder.ASC) {
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] > array[i + 1]) {
                        sorted = false;
                        break;
                    }
                }
            } else { //order == SortOrder.DESC
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] < array[i + 1]) {
                        sorted = false;
                        break;
                    }
                }
            }
            return sorted;
        }
    }




}
