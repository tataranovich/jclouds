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
package org.jclouds.cloudstack.options;

import com.google.common.collect.ImmutableSet;

/**
 * Options to the GlobalUsageClient.listUsageOptions() API call
 *
 * @author Richard Downer
 */
public class ListUsageRecordsOptions extends AccountInDomainOptions {

   public static final ListUsageRecordsOptions NONE = new ListUsageRecordsOptions();

   public static class Builder {
      public static ListUsageRecordsOptions accountInDomain(String account, String domainId) {
         ListUsageRecordsOptions options = new ListUsageRecordsOptions();
         return options.accountInDomain(account, domainId);
      }

      public static ListUsageRecordsOptions domainId(String domainId) {
         ListUsageRecordsOptions options = new ListUsageRecordsOptions();
         return options.domainId(domainId);
      }

      public static ListUsageRecordsOptions accountId(String accountId) {
         ListUsageRecordsOptions options = new ListUsageRecordsOptions();
         return options.accountId(accountId);
      }

      public static ListUsageRecordsOptions keyword(String keyword) {
         ListUsageRecordsOptions options = new ListUsageRecordsOptions();
         return options.keyword(keyword);
      }
   }

   @Override
   public ListUsageRecordsOptions accountInDomain(String account, String domain) {
      return (ListUsageRecordsOptions) super.accountInDomain(account, domain);
   }

   @Override
   public ListUsageRecordsOptions domainId(String domainId) {
      return (ListUsageRecordsOptions) super.domainId(domainId);
   }

   public ListUsageRecordsOptions accountId(String accountId) {
      this.queryParameters.replaceValues("accountid", ImmutableSet.of(accountId + ""));
      return this;
   }

   public ListUsageRecordsOptions keyword(String keyword) {
      this.queryParameters.replaceValues("keyword", ImmutableSet.of(keyword));
      return this;
   }
}
