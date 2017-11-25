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
package org.netbeans.core.network.utils.hname.mac;

import org.netbeans.core.network.utils.NativeException;



/**
 * Host name utilities for for Mac OS X.
 */
public class HostnameUtilsMac {
    
 
    /**
     * Returns the result of {@code gethostname()} function 
     * from the standard Unix/Linux C Library.
     * 
     * <p>
     * Mac OS X has a "dynamic hostname" feature which means that the
     * value returned by this method may be completely different from the
     * value in the Mac's <i>System Preferences</i>. 
     * 
     * @return host name 
     * @throws NativeException if there was an error executing 
     *    the system call.
     */
    public static String cLibGetHostname() throws NativeException {
        return org.netbeans.core.network.utils.hname.unix.HostnameUtilsUnix.cLibGetHostname();
    }
    
}