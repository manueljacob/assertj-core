/*
 * Created on Dec 21, 2010
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS"
 * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 * 
 * Copyright @2010-2011 the original author or authors.
 */
package org.assert4j.core.assertions.api.shortarray;

import static org.assert4j.core.assertions.test.ShortArrays.arrayOf;

import org.assert4j.core.assertions.api.ShortArrayAssert;
import org.assert4j.core.assertions.api.ShortArrayAssertBaseTest;

import static org.mockito.Mockito.verify;


/**
 * Tests for <code>{@link ShortArrayAssert#endsWith(short...)}</code>.
 * 
 * @author Alex Ruiz
 */
public class ShortArrayAssert_endsWith_Test extends ShortArrayAssertBaseTest {

  @Override
  protected ShortArrayAssert invoke_api_method() {
    return assertions.endsWith((short) 6, (short) 8);
  }

  @Override
  protected void verify_internal_effects() {
    verify(arrays).assertEndsWith(getInfo(assertions), getActual(assertions), arrayOf(6, 8));
  }
}