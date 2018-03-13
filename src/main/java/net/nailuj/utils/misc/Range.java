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

import java.util.ArrayList;

/**
 *
 * @author Julian Blazek
 */
public class Range {

    public static int[] range(int end) {
        return range(0, end, 1);
    }

    public static int[] range(int start, int end) {
        return range(start, end, 1);
    }

    public static int[] range(int start, int end, int step) {
        if (step <= 0) {
            throw new IllegalArgumentException("Step has to be positive!");
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = start; i <= end; i += step) {
            list.add(i);
        }
        return ArrayConvert.toArrayInt(list);
    }

}
