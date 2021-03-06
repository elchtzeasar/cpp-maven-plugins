/* 
 *  Copyright 2012 Ericsson AB
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.ericsson.tools.cpp.compiler.osx.compiler;

import org.apache.maven.plugin.logging.Log;
import com.ericsson.tools.cpp.compiler.compilation.RecompilationJudge;
import com.ericsson.tools.cpp.compiler.compilation.gcc.AbstractGccCompiler;
import com.ericsson.tools.cpp.compiler.settings.CompilationSettings;

import com.ericsson.tools.cpp.tools.environment.Environment;


public class OSX64Compiler extends AbstractGccCompiler {
	
	public OSX64Compiler(final Log log, final CompilationSettings settings, final Environment targetEnvironment, final RecompilationJudge recompilationJudge) {
		super(log, settings, targetEnvironment, recompilationJudge);
	}

	@Override
	protected String getMandatoryCompilerArguments() {
		return super.getMandatoryCompilerArguments() + " -m64";
	}
}
