/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.journal.internal.validator;

import com.liferay.journal.model.JournalArticle;
import com.liferay.portal.validation.ModelValidationResults;
import com.liferay.portal.validation.ModelValidator;

import org.osgi.service.component.annotations.Component;

/**
 * @author Mate Thurzo
 */
@Component(
	immediate = true,
	property = "model.class.name=com.liferay.journal.model.JournalArticle",
	service = ModelValidator.class
)
public class JournalArticleModelValidator
	implements ModelValidator<JournalArticle> {

	@Override
	public ModelValidationResults validateModel(JournalArticle model) {
		return ModelValidationResults.success();
	}

}