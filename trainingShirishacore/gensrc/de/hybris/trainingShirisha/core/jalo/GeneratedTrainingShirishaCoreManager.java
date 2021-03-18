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
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.link.Link;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.jalo.user.User;
import de.hybris.platform.util.Utilities;
import de.hybris.trainingShirisha.core.constants.TrainingShirishaCoreConstants;
import de.hybris.trainingShirisha.core.jalo.ApparelProduct;
import de.hybris.trainingShirisha.core.jalo.ApparelSizeVariantProduct;
import de.hybris.trainingShirisha.core.jalo.ApparelStyleVariantProduct;
import de.hybris.trainingShirisha.core.jalo.CustomerCreatedCronJob;
import de.hybris.trainingShirisha.core.jalo.CustomerCreatedDays;
import de.hybris.trainingShirisha.core.jalo.CustomerDetails;
import de.hybris.trainingShirisha.core.jalo.ElectronicsColorVariantProduct;
import de.hybris.trainingShirisha.core.jalo.ManufactureDetails;
import de.hybris.trainingShirisha.core.jalo.ManufactureDetailsAudit;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type <code>TrainingShirishaCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedTrainingShirishaCoreManager extends Extension
{
	/** Relation ordering override parameter constants for ManufactureDetailsProductRelation from ((trainingShirishacore))*/
	protected static String MANUFACTUREDETAILSPRODUCTRELATION_SRC_ORDERED = "relation.ManufactureDetailsProductRelation.source.ordered";
	protected static String MANUFACTUREDETAILSPRODUCTRELATION_TGT_ORDERED = "relation.ManufactureDetailsProductRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for ManufactureDetailsProductRelation from ((trainingShirishacore))*/
	protected static String MANUFACTUREDETAILSPRODUCTRELATION_MARKMODIFIED = "relation.ManufactureDetailsProductRelation.markmodified";
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("isNewCustomer", AttributeMode.INITIAL);
		tmp.put("isNewBusinessUser", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.Customer", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public ApparelProduct createApparelProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingShirishaCoreConstants.TC.APPARELPRODUCT );
			return (ApparelProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelProduct createApparelProduct(final Map attributeValues)
	{
		return createApparelProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingShirishaCoreConstants.TC.APPARELSIZEVARIANTPRODUCT );
			return (ApparelSizeVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final Map attributeValues)
	{
		return createApparelSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingShirishaCoreConstants.TC.APPARELSTYLEVARIANTPRODUCT );
			return (ApparelStyleVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelStyleVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final Map attributeValues)
	{
		return createApparelStyleVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public CustomerCreatedCronJob createCustomerCreatedCronJob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingShirishaCoreConstants.TC.CUSTOMERCREATEDCRONJOB );
			return (CustomerCreatedCronJob)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CustomerCreatedCronJob : "+e.getMessage(), 0 );
		}
	}
	
	public CustomerCreatedCronJob createCustomerCreatedCronJob(final Map attributeValues)
	{
		return createCustomerCreatedCronJob( getSession().getSessionContext(), attributeValues );
	}
	
	public CustomerCreatedDays createCustomerCreatedDays(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingShirishaCoreConstants.TC.CUSTOMERCREATEDDAYS );
			return (CustomerCreatedDays)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CustomerCreatedDays : "+e.getMessage(), 0 );
		}
	}
	
	public CustomerCreatedDays createCustomerCreatedDays(final Map attributeValues)
	{
		return createCustomerCreatedDays( getSession().getSessionContext(), attributeValues );
	}
	
	public CustomerDetails createCustomerDetails(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingShirishaCoreConstants.TC.CUSTOMERDETAILS );
			return (CustomerDetails)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CustomerDetails : "+e.getMessage(), 0 );
		}
	}
	
	public CustomerDetails createCustomerDetails(final Map attributeValues)
	{
		return createCustomerDetails( getSession().getSessionContext(), attributeValues );
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingShirishaCoreConstants.TC.ELECTRONICSCOLORVARIANTPRODUCT );
			return (ElectronicsColorVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ElectronicsColorVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final Map attributeValues)
	{
		return createElectronicsColorVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ManufactureDetails createManufactureDetails(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingShirishaCoreConstants.TC.MANUFACTUREDETAILS );
			return (ManufactureDetails)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ManufactureDetails : "+e.getMessage(), 0 );
		}
	}
	
	public ManufactureDetails createManufactureDetails(final Map attributeValues)
	{
		return createManufactureDetails( getSession().getSessionContext(), attributeValues );
	}
	
	public ManufactureDetailsAudit createManufactureDetailsAudit(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingShirishaCoreConstants.TC.MANUFACTUREDETAILSAUDIT );
			return (ManufactureDetailsAudit)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ManufactureDetailsAudit : "+e.getMessage(), 0 );
		}
	}
	
	public ManufactureDetailsAudit createManufactureDetailsAudit(final Map attributeValues)
	{
		return createManufactureDetailsAudit( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return TrainingShirishaCoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.isNewBusinessUser</code> attribute.
	 * @return the isNewBusinessUser
	 */
	public Boolean isIsNewBusinessUser(final SessionContext ctx, final Customer item)
	{
		return (Boolean)item.getProperty( ctx, TrainingShirishaCoreConstants.Attributes.Customer.ISNEWBUSINESSUSER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.isNewBusinessUser</code> attribute.
	 * @return the isNewBusinessUser
	 */
	public Boolean isIsNewBusinessUser(final Customer item)
	{
		return isIsNewBusinessUser( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.isNewBusinessUser</code> attribute. 
	 * @return the isNewBusinessUser
	 */
	public boolean isIsNewBusinessUserAsPrimitive(final SessionContext ctx, final Customer item)
	{
		Boolean value = isIsNewBusinessUser( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.isNewBusinessUser</code> attribute. 
	 * @return the isNewBusinessUser
	 */
	public boolean isIsNewBusinessUserAsPrimitive(final Customer item)
	{
		return isIsNewBusinessUserAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.isNewBusinessUser</code> attribute. 
	 * @param value the isNewBusinessUser
	 */
	public void setIsNewBusinessUser(final SessionContext ctx, final Customer item, final Boolean value)
	{
		item.setProperty(ctx, TrainingShirishaCoreConstants.Attributes.Customer.ISNEWBUSINESSUSER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.isNewBusinessUser</code> attribute. 
	 * @param value the isNewBusinessUser
	 */
	public void setIsNewBusinessUser(final Customer item, final Boolean value)
	{
		setIsNewBusinessUser( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.isNewBusinessUser</code> attribute. 
	 * @param value the isNewBusinessUser
	 */
	public void setIsNewBusinessUser(final SessionContext ctx, final Customer item, final boolean value)
	{
		setIsNewBusinessUser( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.isNewBusinessUser</code> attribute. 
	 * @param value the isNewBusinessUser
	 */
	public void setIsNewBusinessUser(final Customer item, final boolean value)
	{
		setIsNewBusinessUser( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.isNewCustomer</code> attribute.
	 * @return the isNewCustomer
	 */
	public Boolean isIsNewCustomer(final SessionContext ctx, final Customer item)
	{
		return (Boolean)item.getProperty( ctx, TrainingShirishaCoreConstants.Attributes.Customer.ISNEWCUSTOMER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.isNewCustomer</code> attribute.
	 * @return the isNewCustomer
	 */
	public Boolean isIsNewCustomer(final Customer item)
	{
		return isIsNewCustomer( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.isNewCustomer</code> attribute. 
	 * @return the isNewCustomer
	 */
	public boolean isIsNewCustomerAsPrimitive(final SessionContext ctx, final Customer item)
	{
		Boolean value = isIsNewCustomer( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.isNewCustomer</code> attribute. 
	 * @return the isNewCustomer
	 */
	public boolean isIsNewCustomerAsPrimitive(final Customer item)
	{
		return isIsNewCustomerAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.isNewCustomer</code> attribute. 
	 * @param value the isNewCustomer
	 */
	public void setIsNewCustomer(final SessionContext ctx, final Customer item, final Boolean value)
	{
		item.setProperty(ctx, TrainingShirishaCoreConstants.Attributes.Customer.ISNEWCUSTOMER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.isNewCustomer</code> attribute. 
	 * @param value the isNewCustomer
	 */
	public void setIsNewCustomer(final Customer item, final Boolean value)
	{
		setIsNewCustomer( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.isNewCustomer</code> attribute. 
	 * @param value the isNewCustomer
	 */
	public void setIsNewCustomer(final SessionContext ctx, final Customer item, final boolean value)
	{
		setIsNewCustomer( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.isNewCustomer</code> attribute. 
	 * @param value the isNewCustomer
	 */
	public void setIsNewCustomer(final Customer item, final boolean value)
	{
		setIsNewCustomer( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.manufactureDetails</code> attribute.
	 * @return the manufactureDetails - Manufacture details
	 */
	public Collection<ManufactureDetails> getManufactureDetails(final SessionContext ctx, final Product item)
	{
		final List<ManufactureDetails> items = item.getLinkedItems( 
			ctx,
			false,
			TrainingShirishaCoreConstants.Relations.MANUFACTUREDETAILSPRODUCTRELATION,
			"ManufactureDetails",
			null,
			Utilities.getRelationOrderingOverride(MANUFACTUREDETAILSPRODUCTRELATION_SRC_ORDERED, true),
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.manufactureDetails</code> attribute.
	 * @return the manufactureDetails - Manufacture details
	 */
	public Collection<ManufactureDetails> getManufactureDetails(final Product item)
	{
		return getManufactureDetails( getSession().getSessionContext(), item );
	}
	
	public long getManufactureDetailsCount(final SessionContext ctx, final Product item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			TrainingShirishaCoreConstants.Relations.MANUFACTUREDETAILSPRODUCTRELATION,
			"ManufactureDetails",
			null
		);
	}
	
	public long getManufactureDetailsCount(final Product item)
	{
		return getManufactureDetailsCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.manufactureDetails</code> attribute. 
	 * @param value the manufactureDetails - Manufacture details
	 */
	public void setManufactureDetails(final SessionContext ctx, final Product item, final Collection<ManufactureDetails> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			TrainingShirishaCoreConstants.Relations.MANUFACTUREDETAILSPRODUCTRELATION,
			null,
			value,
			Utilities.getRelationOrderingOverride(MANUFACTUREDETAILSPRODUCTRELATION_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(MANUFACTUREDETAILSPRODUCTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.manufactureDetails</code> attribute. 
	 * @param value the manufactureDetails - Manufacture details
	 */
	public void setManufactureDetails(final Product item, final Collection<ManufactureDetails> value)
	{
		setManufactureDetails( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to manufactureDetails. 
	 * @param value the item to add to manufactureDetails - Manufacture details
	 */
	public void addToManufactureDetails(final SessionContext ctx, final Product item, final ManufactureDetails value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			TrainingShirishaCoreConstants.Relations.MANUFACTUREDETAILSPRODUCTRELATION,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(MANUFACTUREDETAILSPRODUCTRELATION_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(MANUFACTUREDETAILSPRODUCTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to manufactureDetails. 
	 * @param value the item to add to manufactureDetails - Manufacture details
	 */
	public void addToManufactureDetails(final Product item, final ManufactureDetails value)
	{
		addToManufactureDetails( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from manufactureDetails. 
	 * @param value the item to remove from manufactureDetails - Manufacture details
	 */
	public void removeFromManufactureDetails(final SessionContext ctx, final Product item, final ManufactureDetails value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			TrainingShirishaCoreConstants.Relations.MANUFACTUREDETAILSPRODUCTRELATION,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(MANUFACTUREDETAILSPRODUCTRELATION_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(MANUFACTUREDETAILSPRODUCTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from manufactureDetails. 
	 * @param value the item to remove from manufactureDetails - Manufacture details
	 */
	public void removeFromManufactureDetails(final Product item, final ManufactureDetails value)
	{
		removeFromManufactureDetails( getSession().getSessionContext(), item, value );
	}
	
}
