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
package net.nailuj.utils.image;

import java.awt.AWTException;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

/**
 *
 * @author Julian Blazek
 */
public class Screenshot {

    public static Image takeScreenshot() throws AWTException {
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle rect = new Rectangle(size);
        return takeScreenshot(rect);
    }

    public static Image takeScreenshot(int x, int y, int width, int height) throws AWTException {
        Rectangle rect = new Rectangle(x, y, width, height);
        return takeScreenshot(rect);
    }

    public static Image takeScreenshot(Component component) {
        BufferedImage image = new BufferedImage(
                component.getWidth(),
                component.getHeight(),
                BufferedImage.TYPE_INT_RGB
        );
        component.paint(image.getGraphics());
        return image;
    }

    public static Image takeScreenshot(Component component, boolean useFallback) {
        if (useFallback) {
            BufferedImage image = new BufferedImage(
                    component.getWidth(),
                    component.getHeight(),
                    BufferedImage.TYPE_INT_RGB
            );
            component.printAll(image.getGraphics());
            return image;
        } else {
            return takeScreenshot(component);
        }
    }

    public static Image takeScreenshot(Rectangle rect) throws AWTException {
        Robot robot = new Robot();
        return robot.createScreenCapture(rect);
    }

}
