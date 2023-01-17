// <auto-generated>
/*
 * OpenAPI Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Text.Json;
using System.Text.Json.Serialization;
using System.ComponentModel.DataAnnotations;
using OpenAPIClientUtils = Org.OpenAPITools.Client.ClientUtils;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// FruitReq
    /// </summary>
    public partial class FruitReq : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="FruitReq" /> class.
        /// </summary>
        /// <param name="appleReq"></param>
        [JsonConstructor]
        internal FruitReq(AppleReq appleReq)
        {
            AppleReq = appleReq;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="FruitReq" /> class.
        /// </summary>
        /// <param name="bananaReq"></param>
        [JsonConstructor]
        internal FruitReq(BananaReq bananaReq)
        {
            BananaReq = bananaReq;
        }

        /// <summary>
        /// Gets or Sets AppleReq
        /// </summary>
        public AppleReq AppleReq { get; set; }

        /// <summary>
        /// Gets or Sets BananaReq
        /// </summary>
        public BananaReq BananaReq { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class FruitReq {\n");
            sb.Append("}\n");
            return sb.ToString();
        }
        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

    /// <summary>
    /// A Json converter for type FruitReq
    /// </summary>
    public class FruitReqJsonConverter : JsonConverter<FruitReq>
    {
        /// <summary>
        /// A Json reader.
        /// </summary>
        /// <param name="reader"></param>
        /// <param name="typeToConvert"></param>
        /// <param name="options"></param>
        /// <returns></returns>
        /// <exception cref="JsonException"></exception>
        public override FruitReq Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            int currentDepth = reader.CurrentDepth;

            if (reader.TokenType != JsonTokenType.StartObject && reader.TokenType != JsonTokenType.StartArray)
                throw new JsonException();

            JsonTokenType startingTokenType = reader.TokenType;

            Utf8JsonReader appleReqReader = reader;
            bool appleReqDeserialized = Client.ClientUtils.TryDeserialize<AppleReq>(ref appleReqReader, options, out AppleReq appleReq);

            Utf8JsonReader bananaReqReader = reader;
            bool bananaReqDeserialized = Client.ClientUtils.TryDeserialize<BananaReq>(ref bananaReqReader, options, out BananaReq bananaReq);


            while (reader.Read())
            {
                if (startingTokenType == JsonTokenType.StartObject && reader.TokenType == JsonTokenType.EndObject && currentDepth == reader.CurrentDepth)
                    break;

                if (startingTokenType == JsonTokenType.StartArray && reader.TokenType == JsonTokenType.EndArray && currentDepth == reader.CurrentDepth)
                    break;

                if (reader.TokenType == JsonTokenType.PropertyName && currentDepth == reader.CurrentDepth - 1)
                {
                    string propertyName = reader.GetString();
                    reader.Read();

                    switch (propertyName)
                    {
                        default:
                            break;
                    }
                }
            }

            if (appleReqDeserialized)
                return new FruitReq(appleReq);

            if (bananaReqDeserialized)
                return new FruitReq(bananaReq);

            throw new JsonException();
        }

        /// <summary>
        /// A Json writer
        /// </summary>
        /// <param name="writer"></param>
        /// <param name="fruitReq"></param>
        /// <param name="options"></param>
        /// <exception cref="NotImplementedException"></exception>
        public override void Write(Utf8JsonWriter writer, FruitReq fruitReq, JsonSerializerOptions options)
        {
            writer.WriteStartObject();


            writer.WriteEndObject();
        }
    }
}
