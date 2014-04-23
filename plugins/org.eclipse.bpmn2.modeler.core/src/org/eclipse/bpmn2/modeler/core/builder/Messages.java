/*******************************************************************************
 * Copyright (c) 2011, 2012, 2013, 2014 Red Hat, Inc.
 *  All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Red Hat, Inc. - initial API and implementation
 *
 * @author Bob Brodt
 ******************************************************************************/

package org.eclipse.bpmn2.modeler.core.builder;

import org.eclipse.osgi.util.NLS;

/**
 *
 */
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.bpmn2.modeler.core.builder.messages"; //$NON-NLS-1$
	public static String BPMN2Builder_ConfigFileError_Title;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
