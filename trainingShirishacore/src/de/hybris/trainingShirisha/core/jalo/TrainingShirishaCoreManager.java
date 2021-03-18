/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.trainingShirisha.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.trainingShirisha.core.constants.TrainingShirishaCoreConstants;
import de.hybris.trainingShirisha.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class TrainingShirishaCoreManager extends GeneratedTrainingShirishaCoreManager
{
	public static final TrainingShirishaCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (TrainingShirishaCoreManager) em.getExtension(TrainingShirishaCoreConstants.EXTENSIONNAME);
	}
}
