/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Mar 17, 2021, 11:57:50 AM                   ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.trainingShirisha.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.trainingShirisha.core.constants.TrainingShirishaCoreConstants;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem ManufactureDetailsAudit}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedManufactureDetailsAudit extends GenericItem
{
	/** Qualifier of the <code>ManufactureDetailsAudit.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>ManufactureDetailsAudit.currentTime</code> attribute **/
	public static final String CURRENTTIME = "currentTime";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(CURRENTTIME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManufactureDetailsAudit.currentTime</code> attribute.
	 * @return the currentTime
	 */
	public Date getCurrentTime(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, CURRENTTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManufactureDetailsAudit.currentTime</code> attribute.
	 * @return the currentTime
	 */
	public Date getCurrentTime()
	{
		return getCurrentTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManufactureDetailsAudit.currentTime</code> attribute. 
	 * @param value the currentTime
	 */
	public void setCurrentTime(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, CURRENTTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManufactureDetailsAudit.currentTime</code> attribute. 
	 * @param value the currentTime
	 */
	public void setCurrentTime(final Date value)
	{
		setCurrentTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManufactureDetailsAudit.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ManufactureDetailsAudit.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManufactureDetailsAudit.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ManufactureDetailsAudit.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
}
