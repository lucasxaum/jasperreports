/*
 * ============================================================================
 *                   GNU Lesser General Public License
 * ============================================================================
 *
 * JasperReports - Free Java report-generating library.
 * Copyright (C) 2001-2005 Teodor Danciu teodord@users.sourceforge.net
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307, USA.
 * 
 * Teodor Danciu
 * 173, Calea Calarasilor, Bl. 42, Sc. 1, Ap. 18
 * Postal code 030615, Sector 3
 * Bucharest, ROMANIA
 * Email: teodord@users.sourceforge.net
 */
package net.sf.jasperreports.engine.design;

import net.sf.jasperreports.engine.JRLine;


/**
 * @author Teodor Danciu (teodord@users.sourceforge.net)
 * @version $Id$
 */
public class JRDesignLine extends JRDesignGraphicElement implements JRLine
{


	/**
	 *
	 */
	private static final long serialVersionUID = 605;

	/**
	 *
	 */
	protected byte direction = DIRECTION_TOP_DOWN;


	/**
	 *
	 */
	public void setWidth(int width)
	{
		if (width == 0)
		{
			width = 1;
		}
		
		super.setWidth(width);
	}

	/**
	 *
	 */
	public void setHeight(int height)
	{
		if (height == 0)
		{
			height = 1;
		}
		
		super.setHeight(height);
	}

	/**
	 *
	 */
	public byte getDirection()
	{
		return this.direction;
	}

	/**
	 *
	 */
	public void setDirection(byte direction)
	{
		this.direction = direction;
	}


}
