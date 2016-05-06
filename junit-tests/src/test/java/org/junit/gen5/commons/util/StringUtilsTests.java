/*
 * Copyright 2015-2016 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.junit.gen5.commons.util;

import static org.junit.gen5.api.Assertions.assertEquals;
import static org.junit.gen5.api.Assertions.assertTrue;

import org.junit.gen5.api.Test;

class StringUtilsTests {

	@Test
	void blankness() {
		assertTrue(StringUtils.isBlank(null));
		assertTrue(StringUtils.isBlank(""));
		assertTrue(StringUtils.isBlank(" \t\n\r"));
		assertTrue(StringUtils.isNotBlank("."));
	}

	@Test
	void nullSafeToString() {
		assertEquals("", StringUtils.nullSafeToString((Class<?>[]) null));
		assertEquals("", StringUtils.nullSafeToString());
		assertEquals("java.lang.String", StringUtils.nullSafeToString(String.class));
		assertEquals("java.lang.String, java.lang.Integer", StringUtils.nullSafeToString(String.class, Integer.class));
	}

}