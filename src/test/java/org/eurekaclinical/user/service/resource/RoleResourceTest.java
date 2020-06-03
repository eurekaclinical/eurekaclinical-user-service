/*-
 * #%L
 * Eureka! Clinical User Services
 * %%
 * Copyright (C) 2016 Emory University
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package org.eurekaclinical.user.service.resource;

import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import org.junit.Assert;
import org.junit.Test;

import javax.ws.rs.core.MediaType;
import java.util.List;
import org.eurekaclinical.common.comm.Role;

/**
 * Tests for the {@link RoleResource} class.
 *
 * @author hrathod
 *
 */
public class RoleResourceTest extends AbstractServiceResourceTest {

	/**
	 * Simply call super().
	 */
	public RoleResourceTest() {
		super();
	}

	/**
	 * Test that proper number of roles are returned from the resource.
	 */
//	@Test
//	public final void testRoleList() {
//		WebResource webResource = this.resource();
//		List<Role> roles = webResource.path("/api/protected/roles")
//				.accept(MediaType.APPLICATION_JSON)
//				.get(new GenericType<List<Role>>() {
//					// Nothing to implement, used to hold returned data.
//				});
//		Assert.assertEquals(2, roles.size());
//	}
}
