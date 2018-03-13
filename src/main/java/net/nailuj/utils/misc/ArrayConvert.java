/*
 * Copyright (C) 2018 Julian Blazek
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.nailuj.utils.misc;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Julian Blazek
 */
public class ArrayConvert {

    public static int[] toArrayInt(List<Integer> list) {
        int[] returnArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            returnArray[i] = list.get(i);
        }
        return returnArray;
    }

    public static double[] toArrayDouble(List<Double> list) {
        double[] returnArray = new double[list.size()];
        for (int i = 0; i < list.size(); i++) {
            returnArray[i] = list.get(i);
        }
        return returnArray;
    }

    public static long[] toArrayLong(List<Long> list) {
        long[] returnArray = new long[list.size()];
        for (int i = 0; i < list.size(); i++) {
            returnArray[i] = list.get(i);
        }
        return returnArray;
    }

    public static short[] toArrayShort(List<Short> list) {
        short[] returnArray = new short[list.size()];
        for (int i = 0; i < list.size(); i++) {
            returnArray[i] = list.get(i);
        }
        return returnArray;
    }

    public static float[] toArrayFloat(List<Float> list) {
        float[] returnArray = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            returnArray[i] = list.get(i);
        }
        return returnArray;
    }

    public static Object resizeArray(Object oldArray, int newSize) {
        int oldSize = java.lang.reflect.Array.getLength(oldArray);
        Class classType = oldArray.getClass().getComponentType();
        int lengthToCopy = Math.min(oldSize, newSize);
        Object newArray = java.lang.reflect.Array.newInstance(classType, newSize);
        if (lengthToCopy > 0) {
            System.arraycopy(oldArray, 0, newArray, 0, lengthToCopy);
        }
        return newArray;
    }

    @SafeVarargs
    public static <T> List<T> toList(T... array) {
        List<T> list = new ArrayList<T>();
        for (T element : array) {
            list.add(element);
        }
        return list;
    }
}
