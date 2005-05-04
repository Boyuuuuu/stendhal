/* $Id$ */
/***************************************************************************
 *                      (C) Copyright 2003 - Marauroa                      *
 ***************************************************************************
 ***************************************************************************
 *                                                                         *
 *   This program is free software; you can redistribute it and/or modify  *
 *   it under the terms of the GNU General Public License as published by  *
 *   the Free Software Foundation; either version 2 of the License, or     *
 *   (at your option) any later version.                                   *
 *                                                                         *
 ***************************************************************************/
package games.stendhal.common;

import marauroa.common.*;
import java.awt.*;
import java.awt.geom.*;

public class EntityAreas 
  {
  static public void getArea(Rectangle2D rect, String type, double x, double y)
    {
    if(type.equals("food"))
      {
      rect.setRect(x,y,1,1);
      }
    else if(type.equals("sheep"))
      {
      rect.setRect(x+7f/32f,y+53f/32f,(44f-7f)/32f,(63f-53f)/32f);
      }
    else if(type.equals("player"))
      {
      rect.setRect(x+11f/32f,y+50f/32f,(38f-11f)/32f,(60f-50f)/32f);
      }
    else if(type.equals("buyernpc"))
      {
      rect.setRect(x+11f/32f,y+49f/32f,(41f-11f)/32f,(60f-49f)/32f);
      }
    else if(type.equals("sellernpc"))
      {
      rect.setRect(x+11f/32f,y+53f/32f,(40f-11f)/32f,(62f-53f)/32f);
      }
    else if(type.equals("welcomernpc"))
      {
      rect.setRect(x+6f/32f,y+55f/32f,(37f-6f)/32f,(63f-55f)/32f);
      }
    else if(type.equals("trainingdummy"))
      {
      rect.setRect(x+2f/32f,y+51f/32f,(31f-2f)/32f,(64f-51f)/32f);
      }
    else if(type.equals("sign"))
      {
      rect.setRect(x,y,1,1);
      }
    else
      {
      Logger.trace("EntityAreas::getArea","D","No area found for ("+type+")");
      }
    }
    
  static public Rectangle2D getArea(String type, double x, double y)
    {
    Rectangle2D rect=new Rectangle.Double();
    getArea(rect,type,x,y);
    return rect;
    }
    
  static public Rectangle2D getDrawedArea(String type, double x, double y)
    {
    if(type.equals("food"))
      {
      return new Rectangle.Double(x,y,1,1);
      }
    else if(type.equals("sheep"))
      {
      return new Rectangle.Double(x,y,1.5,2);
      }
    else if(type.equals("player"))
      {
      return new Rectangle.Double(x,y,1.5,2);
      }
    else if(type.equals("buyernpc"))
      {
      return new Rectangle.Double(x,y,1.5,2);
      }
    else if(type.equals("sellernpc"))
      {
      return new Rectangle.Double(x,y,1.5,2);
      }
    else if(type.equals("welcomernpc"))
      {
      return new Rectangle.Double(x,y,1.5,2);
      }
    else if(type.equals("sign"))
      {
      return new Rectangle.Double(x,y,1,1);
      }
    else if(type.equals("trainingdummy"))
      {
      return new Rectangle.Double(x,y,1,2);
      }
    else
      {
      return new Rectangle.Double(x,y,1,1);
      }
    }
  }
