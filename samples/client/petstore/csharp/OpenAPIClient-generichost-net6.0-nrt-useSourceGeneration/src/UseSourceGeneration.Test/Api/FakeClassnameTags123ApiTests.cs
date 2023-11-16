/*
 * OpenAPI Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Xunit;
using Microsoft.Extensions.DependencyInjection;
using UseSourceGeneration.Api;
using UseSourceGeneration.Model;


/* *********************************************************************************
*              Follow these manual steps to construct tests.
*              This file will not be overwritten.
*  *********************************************************************************
* 1. Navigate to ApiTests.Base.cs and ensure any tokens are being created correctly.
*    Take care not to commit credentials to any repository.
*
* 2. Mocking is coordinated by ApiTestsBase#AddApiHttpClients.
*    To mock the client, use the generic AddApiHttpClients.
*    To mock the server, change the client's BaseAddress.
*
* 3. Locate the test you want below
*      - remove the skip property from the Fact attribute
*      - set the value of any variables if necessary
*
* 4. Run the tests and ensure they work.
*
*/


namespace UseSourceGeneration.Test.Api
{
    /// <summary>
    ///  Class for testing FakeClassnameTags123Api
    /// </summary>
    public sealed class FakeClassnameTags123ApiTests : ApiTestsBase
    {
        private readonly IFakeClassnameTags123Api _instance;

        public FakeClassnameTags123ApiTests(): base(Array.Empty<string>())
        {
            _instance = _host.Services.GetRequiredService<IFakeClassnameTags123Api>();
        }

        /// <summary>
        /// Test TestClassname
        /// </summary>
        [Fact (Skip = "not implemented")]
        public async Task TestClassnameAsyncTest()
        {
            ModelClient modelClient = default!;
            var response = await _instance.TestClassnameAsync(modelClient);
            var model = response.Ok();
            Assert.IsType<ModelClient>(model);
        }
    }
}
