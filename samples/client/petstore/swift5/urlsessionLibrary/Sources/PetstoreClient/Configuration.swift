// Configuration.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(FoundationNetworking)
import FoundationNetworking
#endif

@available(*, deprecated, renamed: "PetstoreClientAPI.Configuration")
public typealias Configuration = PetstoreClientAPI.Configuration

extension PetstoreClientAPI {
open class Configuration {
    
    /// Configures the range of HTTP status codes that will result in a successful response
    ///
    /// If a HTTP status code is outside of this range the response will be interpreted as failed.
    public static var successfulStatusCodeRange: Range = 200..<300
}
}

