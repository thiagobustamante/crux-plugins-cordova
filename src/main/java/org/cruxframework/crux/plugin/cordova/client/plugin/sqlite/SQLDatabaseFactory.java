/*
 * Copyright 2013 cruxframework.org.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.cruxframework.crux.plugin.cordova.client.plugin.sqlite;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * This requires the https://github.com/litehelpers/cordova-sqlite-ext
 * cordova plugin.
 * 
 * @author Thiago da Rosa de Bustamante
 */
@JsType(namespace=JsPackage.GLOBAL, name="sqlitePlugin")
public class SQLDatabaseFactory
{
	private SQLDatabaseFactory(){}
	
	public static native SQLDatabase openDatabase(SQLDatabaseParameters parameters, SQLSuccessCallback openCallback, SQLErrorCallback errorCallback);
	
	@JsType
	public static class SQLDatabaseParameters
	{
		public int androidDatabaseImplementation;
		public int androidLockWorkaround;
		public int createFromLocation;
		public int location;
		public String name;
	}
}
