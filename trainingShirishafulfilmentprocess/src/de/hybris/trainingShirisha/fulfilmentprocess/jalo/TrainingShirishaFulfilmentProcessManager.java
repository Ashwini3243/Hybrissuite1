/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.trainingShirisha.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.trainingShirisha.fulfilmentprocess.constants.TrainingShirishaFulfilmentProcessConstants;

public class TrainingShirishaFulfilmentProcessManager extends GeneratedTrainingShirishaFulfilmentProcessManager
{
	public static final TrainingShirishaFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (TrainingShirishaFulfilmentProcessManager) em.getExtension(TrainingShirishaFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
