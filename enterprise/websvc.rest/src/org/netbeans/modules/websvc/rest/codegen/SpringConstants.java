/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.netbeans.modules.websvc.rest.codegen;

import org.netbeans.modules.websvc.rest.model.api.RestConstants;

/**
 *
 * @author PeterLiu
 */
public class SpringConstants {
    
    public static final String SPRING_PACKAGE = "org.springframework.";     //NOI18N
    
    public static final String SPRING_TRANSACTION_PACKAGE = SPRING_PACKAGE + "transaction.annotation.";  //NOI18N
  
    public static final String TRANSACTIONAL_ANNOTATION = "Transactional";      //NOI18N
    
    public static final String TRANSACTIONAL = SPRING_TRANSACTION_PACKAGE + TRANSACTIONAL_ANNOTATION;
    
    public static final String AUTOWIRE_ANNOTATION = "Autowire";        //NOI18N
    
    public static final String AUTOWIRE = RestConstants.JERSEY_API_PACKAGE + "spring." + AUTOWIRE_ANNOTATION;   //NOI18N
    
}
