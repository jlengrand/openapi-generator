// <auto-generated>
/*
 * OpenAPI Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

#nullable enable

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
    /// PolymorphicProperty
    /// </summary>
    public partial class PolymorphicProperty : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PolymorphicProperty" /> class.
        /// </summary>
        /// <param name="_bool"></param>
        [JsonConstructor]
        internal PolymorphicProperty(bool _bool)
        {
            Bool = _bool;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="PolymorphicProperty" /> class.
        /// </summary>
        /// <param name="_string"></param>
        [JsonConstructor]
        internal PolymorphicProperty(string _string)
        {
            String = _string;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="PolymorphicProperty" /> class.
        /// </summary>
        /// <param name="_object"></param>
        [JsonConstructor]
        internal PolymorphicProperty(Object _object)
        {
            Object = _object;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="PolymorphicProperty" /> class.
        /// </summary>
        /// <param name="liststring"></param>
        [JsonConstructor]
        internal PolymorphicProperty(List<string> liststring)
        {
            Liststring = liststring;
        }

        /// <summary>
        /// Gets or Sets Bool
        /// </summary>
        public bool? Bool { get; set; }

        /// <summary>
        /// Gets or Sets String
        /// </summary>
        public string? String { get; set; }

        /// <summary>
        /// Gets or Sets Object
        /// </summary>
        public Object? Object { get; set; }

        /// <summary>
        /// Gets or Sets Liststring
        /// </summary>
        public List<string>? Liststring { get; set; }

        /// <summary>
        /// Gets or Sets additional properties
        /// </summary>
        [JsonExtensionData]
        public Dictionary<string, JsonElement> AdditionalProperties { get; } = new Dictionary<string, JsonElement>();

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PolymorphicProperty {\n");
            sb.Append("  AdditionalProperties: ").Append(AdditionalProperties).Append("\n");
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
    /// A Json converter for type PolymorphicProperty
    /// </summary>
    public class PolymorphicPropertyJsonConverter : JsonConverter<PolymorphicProperty>
    {
        /// <summary>
        /// A Json reader.
        /// </summary>
        /// <param name="reader"></param>
        /// <param name="typeToConvert"></param>
        /// <param name="options"></param>
        /// <returns></returns>
        /// <exception cref="JsonException"></exception>
        public override PolymorphicProperty Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            int currentDepth = reader.CurrentDepth;

            if (reader.TokenType != JsonTokenType.StartObject && reader.TokenType != JsonTokenType.StartArray)
                throw new JsonException();

            JsonTokenType startingTokenType = reader.TokenType;

            Utf8JsonReader _boolReader = reader;
            bool _boolDeserialized = Client.ClientUtils.TryDeserialize<bool>(ref _boolReader, options, out bool _bool);

            Utf8JsonReader _stringReader = reader;
            bool _stringDeserialized = Client.ClientUtils.TryDeserialize<string>(ref _stringReader, options, out string? _string);

            Utf8JsonReader _objectReader = reader;
            bool _objectDeserialized = Client.ClientUtils.TryDeserialize<Object>(ref _objectReader, options, out Object? _object);

            Utf8JsonReader liststringReader = reader;
            bool liststringDeserialized = Client.ClientUtils.TryDeserialize<List<string>>(ref liststringReader, options, out List<string>? liststring);


            while (reader.Read())
            {
                if (startingTokenType == JsonTokenType.StartObject && reader.TokenType == JsonTokenType.EndObject && currentDepth == reader.CurrentDepth)
                    break;

                if (startingTokenType == JsonTokenType.StartArray && reader.TokenType == JsonTokenType.EndArray && currentDepth == reader.CurrentDepth)
                    break;

                if (reader.TokenType == JsonTokenType.PropertyName && currentDepth == reader.CurrentDepth - 1)
                {
                    string? propertyName = reader.GetString();
                    reader.Read();

                    switch (propertyName)
                    {
                        default:
                            break;
                    }
                }
            }

            if (_boolDeserialized)
                return new PolymorphicProperty(_bool);

            if (_stringDeserialized)
                return new PolymorphicProperty(_string);

            if (_objectDeserialized)
                return new PolymorphicProperty(_object);

            if (liststringDeserialized)
                return new PolymorphicProperty(liststring);

            throw new JsonException();
        }

        /// <summary>
        /// A Json writer
        /// </summary>
        /// <param name="writer"></param>
        /// <param name="polymorphicProperty"></param>
        /// <param name="options"></param>
        /// <exception cref="NotImplementedException"></exception>
        public override void Write(Utf8JsonWriter writer, PolymorphicProperty polymorphicProperty, JsonSerializerOptions options)
        {
            writer.WriteStartObject();


            writer.WriteEndObject();
        }
    }
}
