/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jclouds.compute.domain;

import java.util.Set;

import org.jclouds.compute.domain.internal.ComputeMetadataImpl;
import org.jclouds.domain.ResourceMetadata;
import org.jclouds.javax.annotation.Nullable;

import com.google.inject.ImplementedBy;

/**
 * @author Ivan Meredith
 * @author Adrian Cole
 */
@ImplementedBy(ComputeMetadataImpl.class)
public interface ComputeMetadata extends ResourceMetadata<ComputeType> {
   /**
    * @return Type of the resource, ex node, image, size
    */
   @Override
   public ComputeType getType();

   /**
    * @return id of the server within the naming scope it was created. potentially generated by the
    *         service.
    */
   @Override
   public String getProviderId();

   /**
    * @return user defined name of the server.
    */
   @Override
   @Nullable
   public String getName();

   /**
    * 
    * A means to uniquely address this resource within a provider. For example, if the namespace of
    * a node or image is region based, the id will likely include both the region and the
    * provider-supplied id encoded to avoid collisions.
    * 
    * @return unique id within your account on the provider
    */
   public String getId();

   /**
    * @return tags describing this resource, if supported
    */
   public Set<String> getTags();
}
