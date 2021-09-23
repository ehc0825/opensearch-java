/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch;

import co.elastic.clients.base.ApiClient;
import co.elastic.clients.base.BooleanResponse;
import co.elastic.clients.base.Transport;
import co.elastic.clients.elasticsearch._core.BulkRequest;
import co.elastic.clients.elasticsearch._core.BulkResponse;
import co.elastic.clients.elasticsearch._core.ClearScrollRequest;
import co.elastic.clients.elasticsearch._core.ClearScrollResponse;
import co.elastic.clients.elasticsearch._core.ClosePointInTimeRequest;
import co.elastic.clients.elasticsearch._core.ClosePointInTimeResponse;
import co.elastic.clients.elasticsearch._core.CountRequest;
import co.elastic.clients.elasticsearch._core.CountResponse;
import co.elastic.clients.elasticsearch._core.CreateRequest;
import co.elastic.clients.elasticsearch._core.CreateResponse;
import co.elastic.clients.elasticsearch._core.DeleteByQueryRequest;
import co.elastic.clients.elasticsearch._core.DeleteByQueryResponse;
import co.elastic.clients.elasticsearch._core.DeleteByQueryRethrottleRequest;
import co.elastic.clients.elasticsearch._core.DeleteByQueryRethrottleResponse;
import co.elastic.clients.elasticsearch._core.DeleteRequest;
import co.elastic.clients.elasticsearch._core.DeleteResponse;
import co.elastic.clients.elasticsearch._core.DeleteScriptRequest;
import co.elastic.clients.elasticsearch._core.DeleteScriptResponse;
import co.elastic.clients.elasticsearch._core.ExistsRequest;
import co.elastic.clients.elasticsearch._core.ExistsSourceRequest;
import co.elastic.clients.elasticsearch._core.ExplainRequest;
import co.elastic.clients.elasticsearch._core.ExplainResponse;
import co.elastic.clients.elasticsearch._core.FieldCapsRequest;
import co.elastic.clients.elasticsearch._core.FieldCapsResponse;
import co.elastic.clients.elasticsearch._core.GetRequest;
import co.elastic.clients.elasticsearch._core.GetResponse;
import co.elastic.clients.elasticsearch._core.GetScriptContextRequest;
import co.elastic.clients.elasticsearch._core.GetScriptContextResponse;
import co.elastic.clients.elasticsearch._core.GetScriptLanguagesRequest;
import co.elastic.clients.elasticsearch._core.GetScriptLanguagesResponse;
import co.elastic.clients.elasticsearch._core.GetScriptRequest;
import co.elastic.clients.elasticsearch._core.GetScriptResponse;
import co.elastic.clients.elasticsearch._core.GetSourceRequest;
import co.elastic.clients.elasticsearch._core.GetSourceResponse;
import co.elastic.clients.elasticsearch._core.IndexRequest;
import co.elastic.clients.elasticsearch._core.IndexResponse;
import co.elastic.clients.elasticsearch._core.InfoRequest;
import co.elastic.clients.elasticsearch._core.InfoResponse;
import co.elastic.clients.elasticsearch._core.MgetRequest;
import co.elastic.clients.elasticsearch._core.MgetResponse;
import co.elastic.clients.elasticsearch._core.MsearchRequest;
import co.elastic.clients.elasticsearch._core.MsearchResponse;
import co.elastic.clients.elasticsearch._core.MsearchTemplateRequest;
import co.elastic.clients.elasticsearch._core.MsearchTemplateResponse;
import co.elastic.clients.elasticsearch._core.MtermvectorsRequest;
import co.elastic.clients.elasticsearch._core.MtermvectorsResponse;
import co.elastic.clients.elasticsearch._core.OpenPointInTimeRequest;
import co.elastic.clients.elasticsearch._core.OpenPointInTimeResponse;
import co.elastic.clients.elasticsearch._core.PingRequest;
import co.elastic.clients.elasticsearch._core.PutScriptRequest;
import co.elastic.clients.elasticsearch._core.PutScriptResponse;
import co.elastic.clients.elasticsearch._core.RankEvalRequest;
import co.elastic.clients.elasticsearch._core.RankEvalResponse;
import co.elastic.clients.elasticsearch._core.ReindexRequest;
import co.elastic.clients.elasticsearch._core.ReindexResponse;
import co.elastic.clients.elasticsearch._core.ReindexRethrottleRequest;
import co.elastic.clients.elasticsearch._core.ReindexRethrottleResponse;
import co.elastic.clients.elasticsearch._core.ScriptsPainlessExecuteRequest;
import co.elastic.clients.elasticsearch._core.ScriptsPainlessExecuteResponse;
import co.elastic.clients.elasticsearch._core.SearchMvtRequest;
import co.elastic.clients.elasticsearch._core.SearchMvtResponse;
import co.elastic.clients.elasticsearch._core.SearchRequest;
import co.elastic.clients.elasticsearch._core.SearchResponse;
import co.elastic.clients.elasticsearch._core.SearchShardsRequest;
import co.elastic.clients.elasticsearch._core.SearchShardsResponse;
import co.elastic.clients.elasticsearch._core.SearchTemplateRequest;
import co.elastic.clients.elasticsearch._core.SearchTemplateResponse;
import co.elastic.clients.elasticsearch._core.TermsEnumRequest;
import co.elastic.clients.elasticsearch._core.TermsEnumResponse;
import co.elastic.clients.elasticsearch._core.TermvectorsRequest;
import co.elastic.clients.elasticsearch._core.TermvectorsResponse;
import co.elastic.clients.elasticsearch._core.UpdateByQueryRequest;
import co.elastic.clients.elasticsearch._core.UpdateByQueryResponse;
import co.elastic.clients.elasticsearch._core.UpdateByQueryRethrottleRequest;
import co.elastic.clients.elasticsearch._core.UpdateByQueryRethrottleResponse;
import co.elastic.clients.elasticsearch._core.UpdateRequest;
import co.elastic.clients.elasticsearch._core.UpdateResponse;
import co.elastic.clients.elasticsearch.async_search.AsyncSearchApiAsyncClient;
import co.elastic.clients.elasticsearch.autoscaling.AutoscalingApiAsyncClient;
import co.elastic.clients.elasticsearch.cat.CatApiAsyncClient;
import co.elastic.clients.elasticsearch.ccr.CcrApiAsyncClient;
import co.elastic.clients.elasticsearch.cluster.ClusterApiAsyncClient;
import co.elastic.clients.elasticsearch.dangling_indices.DanglingIndicesApiAsyncClient;
import co.elastic.clients.elasticsearch.enrich.EnrichApiAsyncClient;
import co.elastic.clients.elasticsearch.eql.EqlApiAsyncClient;
import co.elastic.clients.elasticsearch.features.FeaturesApiAsyncClient;
import co.elastic.clients.elasticsearch.graph.GraphApiAsyncClient;
import co.elastic.clients.elasticsearch.ilm.IlmApiAsyncClient;
import co.elastic.clients.elasticsearch.indices.IndicesApiAsyncClient;
import co.elastic.clients.elasticsearch.ingest.IngestApiAsyncClient;
import co.elastic.clients.elasticsearch.license.LicenseApiAsyncClient;
import co.elastic.clients.elasticsearch.logstash.LogstashApiAsyncClient;
import co.elastic.clients.elasticsearch.migration.MigrationApiAsyncClient;
import co.elastic.clients.elasticsearch.ml.MlApiAsyncClient;
import co.elastic.clients.elasticsearch.monitoring.MonitoringApiAsyncClient;
import co.elastic.clients.elasticsearch.nodes.NodesApiAsyncClient;
import co.elastic.clients.elasticsearch.rollup.RollupApiAsyncClient;
import co.elastic.clients.elasticsearch.searchable_snapshots.SearchableSnapshotsApiAsyncClient;
import co.elastic.clients.elasticsearch.security.SecurityApiAsyncClient;
import co.elastic.clients.elasticsearch.shutdown.ShutdownApiAsyncClient;
import co.elastic.clients.elasticsearch.slm.SlmApiAsyncClient;
import co.elastic.clients.elasticsearch.snapshot.SnapshotApiAsyncClient;
import co.elastic.clients.elasticsearch.sql.SqlApiAsyncClient;
import co.elastic.clients.elasticsearch.ssl.SslApiAsyncClient;
import co.elastic.clients.elasticsearch.tasks.TasksApiAsyncClient;
import co.elastic.clients.elasticsearch.text_structure.TextStructureApiAsyncClient;
import co.elastic.clients.elasticsearch.transform.TransformApiAsyncClient;
import co.elastic.clients.elasticsearch.watcher.WatcherApiAsyncClient;
import co.elastic.clients.elasticsearch.xpack.XpackApiAsyncClient;
import co.elastic.clients.util.ObjectBuilder;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.elasticsearch.client.RequestOptions;

/**
 * Client for the namespace.
 */
public class ElasticsearchAsyncClient extends ApiClient<ElasticsearchAsyncClient> {

	public ElasticsearchAsyncClient(Transport transport) {
		super(transport, null);
	}

	public ElasticsearchAsyncClient(Transport transport, RequestOptions options) {
		super(transport, options);
	}

	// ----- Child clients

	public AsyncSearchApiAsyncClient asyncSearch() {
		return new AsyncSearchApiAsyncClient(this.transport);
	}

	public AutoscalingApiAsyncClient autoscaling() {
		return new AutoscalingApiAsyncClient(this.transport);
	}

	public CatApiAsyncClient cat() {
		return new CatApiAsyncClient(this.transport);
	}

	public CcrApiAsyncClient ccr() {
		return new CcrApiAsyncClient(this.transport);
	}

	public ClusterApiAsyncClient cluster() {
		return new ClusterApiAsyncClient(this.transport);
	}

	public DanglingIndicesApiAsyncClient danglingIndices() {
		return new DanglingIndicesApiAsyncClient(this.transport);
	}

	public EnrichApiAsyncClient enrich() {
		return new EnrichApiAsyncClient(this.transport);
	}

	public EqlApiAsyncClient eql() {
		return new EqlApiAsyncClient(this.transport);
	}

	public FeaturesApiAsyncClient features() {
		return new FeaturesApiAsyncClient(this.transport);
	}

	public GraphApiAsyncClient graph() {
		return new GraphApiAsyncClient(this.transport);
	}

	public IlmApiAsyncClient ilm() {
		return new IlmApiAsyncClient(this.transport);
	}

	public IndicesApiAsyncClient indices() {
		return new IndicesApiAsyncClient(this.transport);
	}

	public IngestApiAsyncClient ingest() {
		return new IngestApiAsyncClient(this.transport);
	}

	public LicenseApiAsyncClient license() {
		return new LicenseApiAsyncClient(this.transport);
	}

	public LogstashApiAsyncClient logstash() {
		return new LogstashApiAsyncClient(this.transport);
	}

	public MigrationApiAsyncClient migration() {
		return new MigrationApiAsyncClient(this.transport);
	}

	public MlApiAsyncClient ml() {
		return new MlApiAsyncClient(this.transport);
	}

	public MonitoringApiAsyncClient monitoring() {
		return new MonitoringApiAsyncClient(this.transport);
	}

	public NodesApiAsyncClient nodes() {
		return new NodesApiAsyncClient(this.transport);
	}

	public RollupApiAsyncClient rollup() {
		return new RollupApiAsyncClient(this.transport);
	}

	public SearchableSnapshotsApiAsyncClient searchableSnapshots() {
		return new SearchableSnapshotsApiAsyncClient(this.transport);
	}

	public SecurityApiAsyncClient security() {
		return new SecurityApiAsyncClient(this.transport);
	}

	public ShutdownApiAsyncClient shutdown() {
		return new ShutdownApiAsyncClient(this.transport);
	}

	public SlmApiAsyncClient slm() {
		return new SlmApiAsyncClient(this.transport);
	}

	public SnapshotApiAsyncClient snapshot() {
		return new SnapshotApiAsyncClient(this.transport);
	}

	public SqlApiAsyncClient sql() {
		return new SqlApiAsyncClient(this.transport);
	}

	public SslApiAsyncClient ssl() {
		return new SslApiAsyncClient(this.transport);
	}

	public TasksApiAsyncClient tasks() {
		return new TasksApiAsyncClient(this.transport);
	}

	public TextStructureApiAsyncClient textStructure() {
		return new TextStructureApiAsyncClient(this.transport);
	}

	public TransformApiAsyncClient transform() {
		return new TransformApiAsyncClient(this.transport);
	}

	public WatcherApiAsyncClient watcher() {
		return new WatcherApiAsyncClient(this.transport);
	}

	public XpackApiAsyncClient xpack() {
		return new XpackApiAsyncClient(this.transport);
	}

	// ----- Endpoint: bulk

	/**
	 * Allows to perform multiple index/update/delete operations in a single
	 * request.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-bulk.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TSource> CompletableFuture<BulkResponse> bulk(BulkRequest<TSource> request) throws IOException {
		return this.transport.performRequestAsync(request, BulkRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Allows to perform multiple index/update/delete operations in a single
	 * request.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-bulk.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TSource> CompletableFuture<BulkResponse> bulk(
			Function<BulkRequest.Builder<TSource>, ObjectBuilder<BulkRequest<TSource>>> fn) throws IOException {
		return bulk(fn.apply(new BulkRequest.Builder<TSource>()).build());
	}

	// ----- Endpoint: clear_scroll

	/**
	 * Explicitly clears the search context for a scroll.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/clear-scroll-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ClearScrollResponse> clearScroll(ClearScrollRequest request) throws IOException {
		return this.transport.performRequestAsync(request, ClearScrollRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Explicitly clears the search context for a scroll.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/clear-scroll-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ClearScrollResponse> clearScroll(
			Function<ClearScrollRequest.Builder, ObjectBuilder<ClearScrollRequest>> fn) throws IOException {
		return clearScroll(fn.apply(new ClearScrollRequest.Builder()).build());
	}

	// ----- Endpoint: close_point_in_time

	/**
	 * Close a point in time
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/point-in-time-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ClosePointInTimeResponse> closePointInTime(ClosePointInTimeRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, ClosePointInTimeRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Close a point in time
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/point-in-time-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ClosePointInTimeResponse> closePointInTime(
			Function<ClosePointInTimeRequest.Builder, ObjectBuilder<ClosePointInTimeRequest>> fn) throws IOException {
		return closePointInTime(fn.apply(new ClosePointInTimeRequest.Builder()).build());
	}

	// ----- Endpoint: count

	/**
	 * Returns number of documents matching a query.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-count.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<CountResponse> count(CountRequest request) throws IOException {
		return this.transport.performRequestAsync(request, CountRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns number of documents matching a query.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-count.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<CountResponse> count(Function<CountRequest.Builder, ObjectBuilder<CountRequest>> fn)
			throws IOException {
		return count(fn.apply(new CountRequest.Builder()).build());
	}

	// ----- Endpoint: create

	/**
	 * Creates a new document in the index.
	 * <p>
	 * Returns a 409 response when a document with a same ID already exists in the
	 * index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-index_.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> CompletableFuture<CreateResponse> create(CreateRequest<TDocument> request) throws IOException {
		return this.transport.performRequestAsync(request, CreateRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Creates a new document in the index.
	 * <p>
	 * Returns a 409 response when a document with a same ID already exists in the
	 * index.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-index_.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> CompletableFuture<CreateResponse> create(
			Function<CreateRequest.Builder<TDocument>, ObjectBuilder<CreateRequest<TDocument>>> fn) throws IOException {
		return create(fn.apply(new CreateRequest.Builder<TDocument>()).build());
	}

	// ----- Endpoint: delete

	/**
	 * Removes a document from the index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-delete.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteResponse> delete(DeleteRequest request) throws IOException {
		return this.transport.performRequestAsync(request, DeleteRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Removes a document from the index.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-delete.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteResponse> delete(
			Function<DeleteRequest.Builder, ObjectBuilder<DeleteRequest>> fn) throws IOException {
		return delete(fn.apply(new DeleteRequest.Builder()).build());
	}

	// ----- Endpoint: delete_by_query

	/**
	 * Deletes documents matching the provided query.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-delete-by-query.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteByQueryResponse> deleteByQuery(DeleteByQueryRequest request) throws IOException {
		return this.transport.performRequestAsync(request, DeleteByQueryRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Deletes documents matching the provided query.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-delete-by-query.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteByQueryResponse> deleteByQuery(
			Function<DeleteByQueryRequest.Builder, ObjectBuilder<DeleteByQueryRequest>> fn) throws IOException {
		return deleteByQuery(fn.apply(new DeleteByQueryRequest.Builder()).build());
	}

	// ----- Endpoint: delete_by_query_rethrottle

	/**
	 * Changes the number of requests per second for a particular Delete By Query
	 * operation.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/docs-delete-by-query.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteByQueryRethrottleResponse> deleteByQueryRethrottle(
			DeleteByQueryRethrottleRequest request) throws IOException {
		return this.transport.performRequestAsync(request, DeleteByQueryRethrottleRequest.ENDPOINT,
				this.requestOptions);
	}

	/**
	 * Changes the number of requests per second for a particular Delete By Query
	 * operation.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/docs-delete-by-query.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteByQueryRethrottleResponse> deleteByQueryRethrottle(
			Function<DeleteByQueryRethrottleRequest.Builder, ObjectBuilder<DeleteByQueryRethrottleRequest>> fn)
			throws IOException {
		return deleteByQueryRethrottle(fn.apply(new DeleteByQueryRethrottleRequest.Builder()).build());
	}

	// ----- Endpoint: delete_script

	/**
	 * Deletes a script.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-scripting.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<DeleteScriptResponse> deleteScript(DeleteScriptRequest request) throws IOException {
		return this.transport.performRequestAsync(request, DeleteScriptRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Deletes a script.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-scripting.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<DeleteScriptResponse> deleteScript(
			Function<DeleteScriptRequest.Builder, ObjectBuilder<DeleteScriptRequest>> fn) throws IOException {
		return deleteScript(fn.apply(new DeleteScriptRequest.Builder()).build());
	}

	// ----- Endpoint: exists

	/**
	 * Returns information about whether a document exists in an index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-get.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<BooleanResponse> exists(ExistsRequest request) throws IOException {
		return this.transport.performRequestAsync(request, ExistsRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns information about whether a document exists in an index.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-get.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<BooleanResponse> exists(
			Function<ExistsRequest.Builder, ObjectBuilder<ExistsRequest>> fn) throws IOException {
		return exists(fn.apply(new ExistsRequest.Builder()).build());
	}

	// ----- Endpoint: exists_source

	/**
	 * Returns information about whether a document source exists in an index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-get.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<BooleanResponse> existsSource(ExistsSourceRequest request) throws IOException {
		return this.transport.performRequestAsync(request, ExistsSourceRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns information about whether a document source exists in an index.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-get.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<BooleanResponse> existsSource(
			Function<ExistsSourceRequest.Builder, ObjectBuilder<ExistsSourceRequest>> fn) throws IOException {
		return existsSource(fn.apply(new ExistsSourceRequest.Builder()).build());
	}

	// ----- Endpoint: explain

	/**
	 * Returns information about why a specific matches (or doesn't match) a query.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-explain.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> CompletableFuture<ExplainResponse<TDocument>> explain(ExplainRequest request,
			Class<TDocument> tDocumentClass) throws IOException {
		return this.transport.performRequestAsync(request,
				ExplainRequest.createExplainEndpoint(getDeserializer(tDocumentClass)), this.requestOptions);
	}

	/**
	 * Returns information about why a specific matches (or doesn't match) a query.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-explain.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> CompletableFuture<ExplainResponse<TDocument>> explain(
			Function<ExplainRequest.Builder, ObjectBuilder<ExplainRequest>> fn, Class<TDocument> tDocumentClass)
			throws IOException {
		return explain(fn.apply(new ExplainRequest.Builder()).build(), tDocumentClass);
	}

	// ----- Endpoint: field_caps

	/**
	 * Returns the information about the capabilities of fields among multiple
	 * indices.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-field-caps.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<FieldCapsResponse> fieldCaps(FieldCapsRequest request) throws IOException {
		return this.transport.performRequestAsync(request, FieldCapsRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns the information about the capabilities of fields among multiple
	 * indices.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-field-caps.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<FieldCapsResponse> fieldCaps(
			Function<FieldCapsRequest.Builder, ObjectBuilder<FieldCapsRequest>> fn) throws IOException {
		return fieldCaps(fn.apply(new FieldCapsRequest.Builder()).build());
	}

	// ----- Endpoint: get

	/**
	 * Returns a document.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-get.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> CompletableFuture<GetResponse<TDocument>> get(GetRequest request,
			Class<TDocument> tDocumentClass) throws IOException {
		return this.transport.performRequestAsync(request,
				GetRequest.createGetEndpoint(getDeserializer(tDocumentClass)), this.requestOptions);
	}

	/**
	 * Returns a document.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-get.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> CompletableFuture<GetResponse<TDocument>> get(
			Function<GetRequest.Builder, ObjectBuilder<GetRequest>> fn, Class<TDocument> tDocumentClass)
			throws IOException {
		return get(fn.apply(new GetRequest.Builder()).build(), tDocumentClass);
	}

	// ----- Endpoint: get_script

	/**
	 * Returns a script.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-scripting.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<GetScriptResponse> getScript(GetScriptRequest request) throws IOException {
		return this.transport.performRequestAsync(request, GetScriptRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns a script.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-scripting.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<GetScriptResponse> getScript(
			Function<GetScriptRequest.Builder, ObjectBuilder<GetScriptRequest>> fn) throws IOException {
		return getScript(fn.apply(new GetScriptRequest.Builder()).build());
	}

	// ----- Endpoint: get_script_context

	/**
	 * Returns all script contexts.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/painless/master/painless-contexts.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<GetScriptContextResponse> getScriptContext() throws IOException {
		return this.transport.performRequestAsync(GetScriptContextRequest.INSTANCE, GetScriptContextRequest.ENDPOINT,
				this.requestOptions);
	}

	// ----- Endpoint: get_script_languages

	/**
	 * Returns available script types, languages and contexts
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-scripting.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<GetScriptLanguagesResponse> getScriptLanguages() throws IOException {
		return this.transport.performRequestAsync(GetScriptLanguagesRequest.INSTANCE,
				GetScriptLanguagesRequest.ENDPOINT, this.requestOptions);
	}

	// ----- Endpoint: get_source

	/**
	 * Returns the source of a document.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-get.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> CompletableFuture<GetSourceResponse<TDocument>> getSource(GetSourceRequest request,
			Class<TDocument> tDocumentClass) throws IOException {
		return this.transport.performRequestAsync(request,
				GetSourceRequest.createGetSourceEndpoint(getDeserializer(tDocumentClass)), this.requestOptions);
	}

	/**
	 * Returns the source of a document.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-get.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> CompletableFuture<GetSourceResponse<TDocument>> getSource(
			Function<GetSourceRequest.Builder, ObjectBuilder<GetSourceRequest>> fn, Class<TDocument> tDocumentClass)
			throws IOException {
		return getSource(fn.apply(new GetSourceRequest.Builder()).build(), tDocumentClass);
	}

	// ----- Endpoint: index

	/**
	 * Creates or updates a document in an index.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-index_.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> CompletableFuture<IndexResponse> index(IndexRequest<TDocument> request) throws IOException {
		return this.transport.performRequestAsync(request, IndexRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Creates or updates a document in an index.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-index_.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> CompletableFuture<IndexResponse> index(
			Function<IndexRequest.Builder<TDocument>, ObjectBuilder<IndexRequest<TDocument>>> fn) throws IOException {
		return index(fn.apply(new IndexRequest.Builder<TDocument>()).build());
	}

	// ----- Endpoint: info

	/**
	 * Returns basic information about the cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/index.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<InfoResponse> info() throws IOException {
		return this.transport.performRequestAsync(InfoRequest.INSTANCE, InfoRequest.ENDPOINT, this.requestOptions);
	}

	// ----- Endpoint: mget

	/**
	 * Allows to get multiple documents in one request.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-multi-get.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> CompletableFuture<MgetResponse<TDocument>> mget(MgetRequest request,
			Class<TDocument> tDocumentClass) throws IOException {
		return this.transport.performRequestAsync(request,
				MgetRequest.createMgetEndpoint(getDeserializer(tDocumentClass)), this.requestOptions);
	}

	/**
	 * Allows to get multiple documents in one request.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-multi-get.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> CompletableFuture<MgetResponse<TDocument>> mget(
			Function<MgetRequest.Builder, ObjectBuilder<MgetRequest>> fn, Class<TDocument> tDocumentClass)
			throws IOException {
		return mget(fn.apply(new MgetRequest.Builder()).build(), tDocumentClass);
	}

	// ----- Endpoint: msearch

	/**
	 * Allows to execute several search operations in one request.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-multi-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> CompletableFuture<MsearchResponse<TDocument>> msearch(MsearchRequest request,
			Class<TDocument> tDocumentClass) throws IOException {
		return this.transport.performRequestAsync(request,
				MsearchRequest.createMsearchEndpoint(getDeserializer(tDocumentClass)), this.requestOptions);
	}

	/**
	 * Allows to execute several search operations in one request.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-multi-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> CompletableFuture<MsearchResponse<TDocument>> msearch(
			Function<MsearchRequest.Builder, ObjectBuilder<MsearchRequest>> fn, Class<TDocument> tDocumentClass)
			throws IOException {
		return msearch(fn.apply(new MsearchRequest.Builder()).build(), tDocumentClass);
	}

	// ----- Endpoint: msearch_template

	/**
	 * Allows to execute several search template operations in one request.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/search-multi-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> CompletableFuture<MsearchTemplateResponse<TDocument>> msearchTemplate(
			MsearchTemplateRequest request, Class<TDocument> tDocumentClass) throws IOException {
		return this.transport.performRequestAsync(request,
				MsearchTemplateRequest.createMsearchTemplateEndpoint(getDeserializer(tDocumentClass)),
				this.requestOptions);
	}

	/**
	 * Allows to execute several search template operations in one request.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/search-multi-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> CompletableFuture<MsearchTemplateResponse<TDocument>> msearchTemplate(
			Function<MsearchTemplateRequest.Builder, ObjectBuilder<MsearchTemplateRequest>> fn,
			Class<TDocument> tDocumentClass) throws IOException {
		return msearchTemplate(fn.apply(new MsearchTemplateRequest.Builder()).build(), tDocumentClass);
	}

	// ----- Endpoint: mtermvectors

	/**
	 * Returns multiple termvectors in one request.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-multi-termvectors.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<MtermvectorsResponse> mtermvectors(MtermvectorsRequest request) throws IOException {
		return this.transport.performRequestAsync(request, MtermvectorsRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns multiple termvectors in one request.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-multi-termvectors.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<MtermvectorsResponse> mtermvectors(
			Function<MtermvectorsRequest.Builder, ObjectBuilder<MtermvectorsRequest>> fn) throws IOException {
		return mtermvectors(fn.apply(new MtermvectorsRequest.Builder()).build());
	}

	// ----- Endpoint: open_point_in_time

	/**
	 * Open a point in time that can be used in subsequent searches
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/point-in-time-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<OpenPointInTimeResponse> openPointInTime(OpenPointInTimeRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, OpenPointInTimeRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Open a point in time that can be used in subsequent searches
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/point-in-time-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<OpenPointInTimeResponse> openPointInTime(
			Function<OpenPointInTimeRequest.Builder, ObjectBuilder<OpenPointInTimeRequest>> fn) throws IOException {
		return openPointInTime(fn.apply(new OpenPointInTimeRequest.Builder()).build());
	}

	// ----- Endpoint: ping

	/**
	 * Returns whether the cluster is running.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/index.html">Documentation
	 *      on elastic.co</a>
	 */
	public CompletableFuture<BooleanResponse> ping() throws IOException {
		return this.transport.performRequestAsync(PingRequest.INSTANCE, PingRequest.ENDPOINT, this.requestOptions);
	}

	// ----- Endpoint: put_script

	/**
	 * Creates or updates a script.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-scripting.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<PutScriptResponse> putScript(PutScriptRequest request) throws IOException {
		return this.transport.performRequestAsync(request, PutScriptRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Creates or updates a script.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/modules-scripting.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<PutScriptResponse> putScript(
			Function<PutScriptRequest.Builder, ObjectBuilder<PutScriptRequest>> fn) throws IOException {
		return putScript(fn.apply(new PutScriptRequest.Builder()).build());
	}

	// ----- Endpoint: rank_eval

	/**
	 * Allows to evaluate the quality of ranked search results over a set of typical
	 * search queries
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-rank-eval.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<RankEvalResponse> rankEval(RankEvalRequest request) throws IOException {
		return this.transport.performRequestAsync(request, RankEvalRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Allows to evaluate the quality of ranked search results over a set of typical
	 * search queries
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-rank-eval.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<RankEvalResponse> rankEval(
			Function<RankEvalRequest.Builder, ObjectBuilder<RankEvalRequest>> fn) throws IOException {
		return rankEval(fn.apply(new RankEvalRequest.Builder()).build());
	}

	// ----- Endpoint: reindex

	/**
	 * Allows to copy documents from one index to another, optionally filtering the
	 * source documents by a query, changing the destination index settings, or
	 * fetching the documents from a remote cluster.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-reindex.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ReindexResponse> reindex(ReindexRequest request) throws IOException {
		return this.transport.performRequestAsync(request, ReindexRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Allows to copy documents from one index to another, optionally filtering the
	 * source documents by a query, changing the destination index settings, or
	 * fetching the documents from a remote cluster.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-reindex.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ReindexResponse> reindex(
			Function<ReindexRequest.Builder, ObjectBuilder<ReindexRequest>> fn) throws IOException {
		return reindex(fn.apply(new ReindexRequest.Builder()).build());
	}

	// ----- Endpoint: reindex_rethrottle

	/**
	 * Changes the number of requests per second for a particular Reindex operation.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-reindex.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<ReindexRethrottleResponse> reindexRethrottle(ReindexRethrottleRequest request)
			throws IOException {
		return this.transport.performRequestAsync(request, ReindexRethrottleRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Changes the number of requests per second for a particular Reindex operation.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-reindex.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<ReindexRethrottleResponse> reindexRethrottle(
			Function<ReindexRethrottleRequest.Builder, ObjectBuilder<ReindexRethrottleRequest>> fn) throws IOException {
		return reindexRethrottle(fn.apply(new ReindexRethrottleRequest.Builder()).build());
	}

	// ----- Endpoint: scripts_painless_execute

	/**
	 * Allows an arbitrary script to be executed and a result to be returned
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/painless/master/painless-execute-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TResult> CompletableFuture<ScriptsPainlessExecuteResponse<TResult>> scriptsPainlessExecute(
			ScriptsPainlessExecuteRequest request, Class<TResult> tResultClass) throws IOException {
		return this.transport.performRequestAsync(request,
				ScriptsPainlessExecuteRequest.createScriptsPainlessExecuteEndpoint(getDeserializer(tResultClass)),
				this.requestOptions);
	}

	/**
	 * Allows an arbitrary script to be executed and a result to be returned
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/painless/master/painless-execute-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TResult> CompletableFuture<ScriptsPainlessExecuteResponse<TResult>> scriptsPainlessExecute(
			Function<ScriptsPainlessExecuteRequest.Builder, ObjectBuilder<ScriptsPainlessExecuteRequest>> fn,
			Class<TResult> tResultClass) throws IOException {
		return scriptsPainlessExecute(fn.apply(new ScriptsPainlessExecuteRequest.Builder()).build(), tResultClass);
	}

	// ----- Endpoint: search

	/**
	 * Returns results matching a query.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> CompletableFuture<SearchResponse<TDocument>> search(SearchRequest request,
			Class<TDocument> tDocumentClass) throws IOException {
		return this.transport.performRequestAsync(request,
				SearchRequest.createSearchEndpoint(getDeserializer(tDocumentClass)), this.requestOptions);
	}

	/**
	 * Returns results matching a query.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-search.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> CompletableFuture<SearchResponse<TDocument>> search(
			Function<SearchRequest.Builder, ObjectBuilder<SearchRequest>> fn, Class<TDocument> tDocumentClass)
			throws IOException {
		return search(fn.apply(new SearchRequest.Builder()).build(), tDocumentClass);
	}

	// ----- Endpoint: search_mvt

	/**
	 * Searches a vector tile for geospatial values. Returns results as a binary
	 * Mapbox vector tile.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-vector-tile-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SearchMvtResponse> searchMvt(SearchMvtRequest request) throws IOException {
		return this.transport.performRequestAsync(request, SearchMvtRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Searches a vector tile for geospatial values. Returns results as a binary
	 * Mapbox vector tile.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-vector-tile-api.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<SearchMvtResponse> searchMvt(
			Function<SearchMvtRequest.Builder, ObjectBuilder<SearchMvtRequest>> fn) throws IOException {
		return searchMvt(fn.apply(new SearchMvtRequest.Builder()).build());
	}

	// ----- Endpoint: search_shards

	/**
	 * Returns information about the indices and shards that a search request would
	 * be executed against.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-shards.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<SearchShardsResponse> searchShards(SearchShardsRequest request) throws IOException {
		return this.transport.performRequestAsync(request, SearchShardsRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns information about the indices and shards that a search request would
	 * be executed against.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/search-shards.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<SearchShardsResponse> searchShards(
			Function<SearchShardsRequest.Builder, ObjectBuilder<SearchShardsRequest>> fn) throws IOException {
		return searchShards(fn.apply(new SearchShardsRequest.Builder()).build());
	}

	// ----- Endpoint: search_template

	/**
	 * Allows to use the Mustache language to pre-render a search definition.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/search-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> CompletableFuture<SearchTemplateResponse<TDocument>> searchTemplate(
			SearchTemplateRequest request, Class<TDocument> tDocumentClass) throws IOException {
		return this.transport.performRequestAsync(request,
				SearchTemplateRequest.createSearchTemplateEndpoint(getDeserializer(tDocumentClass)),
				this.requestOptions);
	}

	/**
	 * Allows to use the Mustache language to pre-render a search definition.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/search-template.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> CompletableFuture<SearchTemplateResponse<TDocument>> searchTemplate(
			Function<SearchTemplateRequest.Builder, ObjectBuilder<SearchTemplateRequest>> fn,
			Class<TDocument> tDocumentClass) throws IOException {
		return searchTemplate(fn.apply(new SearchTemplateRequest.Builder()).build(), tDocumentClass);
	}

	// ----- Endpoint: terms_enum

	/**
	 * The terms enum API can be used to discover terms in the index that begin with
	 * the provided string. It is designed for low-latency look-ups used in
	 * auto-complete scenarios.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/search-terms-enum.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<TermsEnumResponse> termsEnum(TermsEnumRequest request) throws IOException {
		return this.transport.performRequestAsync(request, TermsEnumRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * The terms enum API can be used to discover terms in the index that begin with
	 * the provided string. It is designed for low-latency look-ups used in
	 * auto-complete scenarios.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/search-terms-enum.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<TermsEnumResponse> termsEnum(
			Function<TermsEnumRequest.Builder, ObjectBuilder<TermsEnumRequest>> fn) throws IOException {
		return termsEnum(fn.apply(new TermsEnumRequest.Builder()).build());
	}

	// ----- Endpoint: termvectors

	/**
	 * Returns information and statistics about terms in the fields of a particular
	 * document.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-termvectors.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument> CompletableFuture<TermvectorsResponse> termvectors(TermvectorsRequest<TDocument> request)
			throws IOException {
		return this.transport.performRequestAsync(request, TermvectorsRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Returns information and statistics about terms in the fields of a particular
	 * document.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-termvectors.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument> CompletableFuture<TermvectorsResponse> termvectors(
			Function<TermvectorsRequest.Builder<TDocument>, ObjectBuilder<TermvectorsRequest<TDocument>>> fn)
			throws IOException {
		return termvectors(fn.apply(new TermvectorsRequest.Builder<TDocument>()).build());
	}

	// ----- Endpoint: update

	/**
	 * Updates a document with a script or partial document.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-update.html">Documentation
	 *      on elastic.co</a>
	 */

	public <TDocument, TPartialDocument> CompletableFuture<UpdateResponse<TDocument>> update(
			UpdateRequest<TDocument, TPartialDocument> request, Class<TDocument> tDocumentClass) throws IOException {
		return this.transport.performRequestAsync(request,
				UpdateRequest.createUpdateEndpoint(getDeserializer(tDocumentClass)), this.requestOptions);
	}

	/**
	 * Updates a document with a script or partial document.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-update.html">Documentation
	 *      on elastic.co</a>
	 */

	public final <TDocument, TPartialDocument> CompletableFuture<UpdateResponse<TDocument>> update(
			Function<UpdateRequest.Builder<TDocument, TPartialDocument>, ObjectBuilder<UpdateRequest<TDocument, TPartialDocument>>> fn,
			Class<TDocument> tDocumentClass) throws IOException {
		return update(fn.apply(new UpdateRequest.Builder<TDocument, TPartialDocument>()).build(), tDocumentClass);
	}

	// ----- Endpoint: update_by_query

	/**
	 * Performs an update on every document in the index without changing the
	 * source, for example to pick up a mapping change.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-update-by-query.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<UpdateByQueryResponse> updateByQuery(UpdateByQueryRequest request) throws IOException {
		return this.transport.performRequestAsync(request, UpdateByQueryRequest.ENDPOINT, this.requestOptions);
	}

	/**
	 * Performs an update on every document in the index without changing the
	 * source, for example to pick up a mapping change.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/master/docs-update-by-query.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<UpdateByQueryResponse> updateByQuery(
			Function<UpdateByQueryRequest.Builder, ObjectBuilder<UpdateByQueryRequest>> fn) throws IOException {
		return updateByQuery(fn.apply(new UpdateByQueryRequest.Builder()).build());
	}

	// ----- Endpoint: update_by_query_rethrottle

	/**
	 * Changes the number of requests per second for a particular Update By Query
	 * operation.
	 * 
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/docs-update-by-query.html">Documentation
	 *      on elastic.co</a>
	 */

	public CompletableFuture<UpdateByQueryRethrottleResponse> updateByQueryRethrottle(
			UpdateByQueryRethrottleRequest request) throws IOException {
		return this.transport.performRequestAsync(request, UpdateByQueryRethrottleRequest.ENDPOINT,
				this.requestOptions);
	}

	/**
	 * Changes the number of requests per second for a particular Update By Query
	 * operation.
	 * 
	 * @param fn
	 *            a function that initializes a freshly created builder. This
	 *            function can either return its builder argument after having set
	 *            its properties or return another builder.
	 * @see <a href=
	 *      "https://www.elastic.co/guide/en/elasticsearch/reference/current/docs-update-by-query.html">Documentation
	 *      on elastic.co</a>
	 */

	public final CompletableFuture<UpdateByQueryRethrottleResponse> updateByQueryRethrottle(
			Function<UpdateByQueryRethrottleRequest.Builder, ObjectBuilder<UpdateByQueryRethrottleRequest>> fn)
			throws IOException {
		return updateByQueryRethrottle(fn.apply(new UpdateByQueryRethrottleRequest.Builder()).build());
	}

	// ----- Misc

	/**
	 * Creates a new {@link #ElasticsearchAsyncClient} with specific request
	 * options.
	 */
	@Override
	public ElasticsearchAsyncClient withRequestOptions(@Nullable RequestOptions options) {
		return new ElasticsearchAsyncClient(transport, options);
	}

	/**
	 * Creates a new {@link #ElasticsearchAsyncClient} with specific request
	 * options, inheriting existing options.
	 *
	 * @param fn
	 *            a function taking an options builder initialized with the current
	 *            request options, or initialized with default values.
	 */
	public ElasticsearchAsyncClient withRequestOptions(Function<RequestOptions.Builder, RequestOptions.Builder> fn) {
		RequestOptions.Builder builder = requestOptions == null
				? RequestOptions.DEFAULT.toBuilder()
				: requestOptions.toBuilder();

		return withRequestOptions(fn.apply(builder).build());
	}
}
