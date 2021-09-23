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

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.put_job.Response
public final class PutJobResponse implements JsonpSerializable {
	private final Boolean allowLazyOpen;

	private final AnalysisConfigRead analysisConfig;

	private final AnalysisLimits analysisLimits;

	@Nullable
	private final JsonValue backgroundPersistInterval;

	private final String createTime;

	@Nullable
	private final CustomSettings customSettings;

	private final Number dailyModelSnapshotRetentionAfterDays;

	private final DataDescription dataDescription;

	@Nullable
	private final Datafeed datafeedConfig;

	@Nullable
	private final String description;

	@Nullable
	private final List<String> groups;

	private final String jobId;

	private final String jobType;

	private final String jobVersion;

	@Nullable
	private final ModelPlotConfig modelPlotConfig;

	@Nullable
	private final String modelSnapshotId;

	private final Number modelSnapshotRetentionDays;

	@Nullable
	private final Number renormalizationWindowDays;

	private final String resultsIndexName;

	@Nullable
	private final Number resultsRetentionDays;

	// ---------------------------------------------------------------------------------------------

	public PutJobResponse(Builder builder) {

		this.allowLazyOpen = Objects.requireNonNull(builder.allowLazyOpen, "allow_lazy_open");
		this.analysisConfig = Objects.requireNonNull(builder.analysisConfig, "analysis_config");
		this.analysisLimits = Objects.requireNonNull(builder.analysisLimits, "analysis_limits");
		this.backgroundPersistInterval = builder.backgroundPersistInterval;
		this.createTime = Objects.requireNonNull(builder.createTime, "create_time");
		this.customSettings = builder.customSettings;
		this.dailyModelSnapshotRetentionAfterDays = Objects.requireNonNull(builder.dailyModelSnapshotRetentionAfterDays,
				"daily_model_snapshot_retention_after_days");
		this.dataDescription = Objects.requireNonNull(builder.dataDescription, "data_description");
		this.datafeedConfig = builder.datafeedConfig;
		this.description = builder.description;
		this.groups = builder.groups;
		this.jobId = Objects.requireNonNull(builder.jobId, "job_id");
		this.jobType = Objects.requireNonNull(builder.jobType, "job_type");
		this.jobVersion = Objects.requireNonNull(builder.jobVersion, "job_version");
		this.modelPlotConfig = builder.modelPlotConfig;
		this.modelSnapshotId = builder.modelSnapshotId;
		this.modelSnapshotRetentionDays = Objects.requireNonNull(builder.modelSnapshotRetentionDays,
				"model_snapshot_retention_days");
		this.renormalizationWindowDays = builder.renormalizationWindowDays;
		this.resultsIndexName = Objects.requireNonNull(builder.resultsIndexName, "results_index_name");
		this.resultsRetentionDays = builder.resultsRetentionDays;

	}

	/**
	 * API name: {@code allow_lazy_open}
	 */
	public Boolean allowLazyOpen() {
		return this.allowLazyOpen;
	}

	/**
	 * API name: {@code analysis_config}
	 */
	public AnalysisConfigRead analysisConfig() {
		return this.analysisConfig;
	}

	/**
	 * API name: {@code analysis_limits}
	 */
	public AnalysisLimits analysisLimits() {
		return this.analysisLimits;
	}

	/**
	 * API name: {@code background_persist_interval}
	 */
	@Nullable
	public JsonValue backgroundPersistInterval() {
		return this.backgroundPersistInterval;
	}

	/**
	 * API name: {@code create_time}
	 */
	public String createTime() {
		return this.createTime;
	}

	/**
	 * API name: {@code custom_settings}
	 */
	@Nullable
	public CustomSettings customSettings() {
		return this.customSettings;
	}

	/**
	 * API name: {@code daily_model_snapshot_retention_after_days}
	 */
	public Number dailyModelSnapshotRetentionAfterDays() {
		return this.dailyModelSnapshotRetentionAfterDays;
	}

	/**
	 * API name: {@code data_description}
	 */
	public DataDescription dataDescription() {
		return this.dataDescription;
	}

	/**
	 * API name: {@code datafeed_config}
	 */
	@Nullable
	public Datafeed datafeedConfig() {
		return this.datafeedConfig;
	}

	/**
	 * API name: {@code description}
	 */
	@Nullable
	public String description() {
		return this.description;
	}

	/**
	 * API name: {@code groups}
	 */
	@Nullable
	public List<String> groups() {
		return this.groups;
	}

	/**
	 * API name: {@code job_id}
	 */
	public String jobId() {
		return this.jobId;
	}

	/**
	 * API name: {@code job_type}
	 */
	public String jobType() {
		return this.jobType;
	}

	/**
	 * API name: {@code job_version}
	 */
	public String jobVersion() {
		return this.jobVersion;
	}

	/**
	 * API name: {@code model_plot_config}
	 */
	@Nullable
	public ModelPlotConfig modelPlotConfig() {
		return this.modelPlotConfig;
	}

	/**
	 * API name: {@code model_snapshot_id}
	 */
	@Nullable
	public String modelSnapshotId() {
		return this.modelSnapshotId;
	}

	/**
	 * API name: {@code model_snapshot_retention_days}
	 */
	public Number modelSnapshotRetentionDays() {
		return this.modelSnapshotRetentionDays;
	}

	/**
	 * API name: {@code renormalization_window_days}
	 */
	@Nullable
	public Number renormalizationWindowDays() {
		return this.renormalizationWindowDays;
	}

	/**
	 * API name: {@code results_index_name}
	 */
	public String resultsIndexName() {
		return this.resultsIndexName;
	}

	/**
	 * API name: {@code results_retention_days}
	 */
	@Nullable
	public Number resultsRetentionDays() {
		return this.resultsRetentionDays;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("allow_lazy_open");
		generator.write(this.allowLazyOpen);

		generator.writeKey("analysis_config");
		this.analysisConfig.serialize(generator, mapper);

		generator.writeKey("analysis_limits");
		this.analysisLimits.serialize(generator, mapper);

		if (this.backgroundPersistInterval != null) {

			generator.writeKey("background_persist_interval");
			generator.write(this.backgroundPersistInterval);

		}

		generator.writeKey("create_time");
		generator.write(this.createTime);

		if (this.customSettings != null) {

			generator.writeKey("custom_settings");
			this.customSettings.serialize(generator, mapper);

		}

		generator.writeKey("daily_model_snapshot_retention_after_days");
		generator.write(this.dailyModelSnapshotRetentionAfterDays.doubleValue());

		generator.writeKey("data_description");
		this.dataDescription.serialize(generator, mapper);

		if (this.datafeedConfig != null) {

			generator.writeKey("datafeed_config");
			this.datafeedConfig.serialize(generator, mapper);

		}
		if (this.description != null) {

			generator.writeKey("description");
			generator.write(this.description);

		}
		if (this.groups != null) {

			generator.writeKey("groups");
			generator.writeStartArray();
			for (String item0 : this.groups) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

		generator.writeKey("job_id");
		generator.write(this.jobId);

		generator.writeKey("job_type");
		generator.write(this.jobType);

		generator.writeKey("job_version");
		generator.write(this.jobVersion);

		if (this.modelPlotConfig != null) {

			generator.writeKey("model_plot_config");
			this.modelPlotConfig.serialize(generator, mapper);

		}
		if (this.modelSnapshotId != null) {

			generator.writeKey("model_snapshot_id");
			generator.write(this.modelSnapshotId);

		}

		generator.writeKey("model_snapshot_retention_days");
		generator.write(this.modelSnapshotRetentionDays.doubleValue());

		if (this.renormalizationWindowDays != null) {

			generator.writeKey("renormalization_window_days");
			generator.write(this.renormalizationWindowDays.doubleValue());

		}

		generator.writeKey("results_index_name");
		generator.write(this.resultsIndexName);

		if (this.resultsRetentionDays != null) {

			generator.writeKey("results_retention_days");
			generator.write(this.resultsRetentionDays.doubleValue());

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutJobResponse}.
	 */
	public static class Builder implements ObjectBuilder<PutJobResponse> {
		private Boolean allowLazyOpen;

		private AnalysisConfigRead analysisConfig;

		private AnalysisLimits analysisLimits;

		@Nullable
		private JsonValue backgroundPersistInterval;

		private String createTime;

		@Nullable
		private CustomSettings customSettings;

		private Number dailyModelSnapshotRetentionAfterDays;

		private DataDescription dataDescription;

		@Nullable
		private Datafeed datafeedConfig;

		@Nullable
		private String description;

		@Nullable
		private List<String> groups;

		private String jobId;

		private String jobType;

		private String jobVersion;

		@Nullable
		private ModelPlotConfig modelPlotConfig;

		@Nullable
		private String modelSnapshotId;

		private Number modelSnapshotRetentionDays;

		@Nullable
		private Number renormalizationWindowDays;

		private String resultsIndexName;

		@Nullable
		private Number resultsRetentionDays;

		/**
		 * API name: {@code allow_lazy_open}
		 */
		public Builder allowLazyOpen(Boolean value) {
			this.allowLazyOpen = value;
			return this;
		}

		/**
		 * API name: {@code analysis_config}
		 */
		public Builder analysisConfig(AnalysisConfigRead value) {
			this.analysisConfig = value;
			return this;
		}

		/**
		 * API name: {@code analysis_config}
		 */
		public Builder analysisConfig(Function<AnalysisConfigRead.Builder, ObjectBuilder<AnalysisConfigRead>> fn) {
			return this.analysisConfig(fn.apply(new AnalysisConfigRead.Builder()).build());
		}

		/**
		 * API name: {@code analysis_limits}
		 */
		public Builder analysisLimits(AnalysisLimits value) {
			this.analysisLimits = value;
			return this;
		}

		/**
		 * API name: {@code analysis_limits}
		 */
		public Builder analysisLimits(Function<AnalysisLimits.Builder, ObjectBuilder<AnalysisLimits>> fn) {
			return this.analysisLimits(fn.apply(new AnalysisLimits.Builder()).build());
		}

		/**
		 * API name: {@code background_persist_interval}
		 */
		public Builder backgroundPersistInterval(@Nullable JsonValue value) {
			this.backgroundPersistInterval = value;
			return this;
		}

		/**
		 * API name: {@code create_time}
		 */
		public Builder createTime(String value) {
			this.createTime = value;
			return this;
		}

		/**
		 * API name: {@code custom_settings}
		 */
		public Builder customSettings(@Nullable CustomSettings value) {
			this.customSettings = value;
			return this;
		}

		/**
		 * API name: {@code custom_settings}
		 */
		public Builder customSettings(Function<CustomSettings.Builder, ObjectBuilder<CustomSettings>> fn) {
			return this.customSettings(fn.apply(new CustomSettings.Builder()).build());
		}

		/**
		 * API name: {@code daily_model_snapshot_retention_after_days}
		 */
		public Builder dailyModelSnapshotRetentionAfterDays(Number value) {
			this.dailyModelSnapshotRetentionAfterDays = value;
			return this;
		}

		/**
		 * API name: {@code data_description}
		 */
		public Builder dataDescription(DataDescription value) {
			this.dataDescription = value;
			return this;
		}

		/**
		 * API name: {@code data_description}
		 */
		public Builder dataDescription(Function<DataDescription.Builder, ObjectBuilder<DataDescription>> fn) {
			return this.dataDescription(fn.apply(new DataDescription.Builder()).build());
		}

		/**
		 * API name: {@code datafeed_config}
		 */
		public Builder datafeedConfig(@Nullable Datafeed value) {
			this.datafeedConfig = value;
			return this;
		}

		/**
		 * API name: {@code datafeed_config}
		 */
		public Builder datafeedConfig(Function<Datafeed.Builder, ObjectBuilder<Datafeed>> fn) {
			return this.datafeedConfig(fn.apply(new Datafeed.Builder()).build());
		}

		/**
		 * API name: {@code description}
		 */
		public Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * API name: {@code groups}
		 */
		public Builder groups(@Nullable List<String> value) {
			this.groups = value;
			return this;
		}

		/**
		 * API name: {@code groups}
		 */
		public Builder groups(String... value) {
			this.groups = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #groups(List)}, creating the list if needed.
		 */
		public Builder addGroups(String value) {
			if (this.groups == null) {
				this.groups = new ArrayList<>();
			}
			this.groups.add(value);
			return this;
		}

		/**
		 * API name: {@code job_id}
		 */
		public Builder jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * API name: {@code job_type}
		 */
		public Builder jobType(String value) {
			this.jobType = value;
			return this;
		}

		/**
		 * API name: {@code job_version}
		 */
		public Builder jobVersion(String value) {
			this.jobVersion = value;
			return this;
		}

		/**
		 * API name: {@code model_plot_config}
		 */
		public Builder modelPlotConfig(@Nullable ModelPlotConfig value) {
			this.modelPlotConfig = value;
			return this;
		}

		/**
		 * API name: {@code model_plot_config}
		 */
		public Builder modelPlotConfig(Function<ModelPlotConfig.Builder, ObjectBuilder<ModelPlotConfig>> fn) {
			return this.modelPlotConfig(fn.apply(new ModelPlotConfig.Builder()).build());
		}

		/**
		 * API name: {@code model_snapshot_id}
		 */
		public Builder modelSnapshotId(@Nullable String value) {
			this.modelSnapshotId = value;
			return this;
		}

		/**
		 * API name: {@code model_snapshot_retention_days}
		 */
		public Builder modelSnapshotRetentionDays(Number value) {
			this.modelSnapshotRetentionDays = value;
			return this;
		}

		/**
		 * API name: {@code renormalization_window_days}
		 */
		public Builder renormalizationWindowDays(@Nullable Number value) {
			this.renormalizationWindowDays = value;
			return this;
		}

		/**
		 * API name: {@code results_index_name}
		 */
		public Builder resultsIndexName(String value) {
			this.resultsIndexName = value;
			return this;
		}

		/**
		 * API name: {@code results_retention_days}
		 */
		public Builder resultsRetentionDays(@Nullable Number value) {
			this.resultsRetentionDays = value;
			return this;
		}

		/**
		 * Builds a {@link PutJobResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutJobResponse build() {

			return new PutJobResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutJobResponse}
	 */
	public static final JsonpDeserializer<PutJobResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, PutJobResponse::setupPutJobResponseDeserializer);

	protected static void setupPutJobResponseDeserializer(DelegatingDeserializer<PutJobResponse.Builder> op) {

		op.add(Builder::allowLazyOpen, JsonpDeserializer.booleanDeserializer(), "allow_lazy_open");
		op.add(Builder::analysisConfig, AnalysisConfigRead.DESERIALIZER, "analysis_config");
		op.add(Builder::analysisLimits, AnalysisLimits.DESERIALIZER, "analysis_limits");
		op.add(Builder::backgroundPersistInterval, JsonpDeserializer.jsonValueDeserializer(),
				"background_persist_interval");
		op.add(Builder::createTime, JsonpDeserializer.stringDeserializer(), "create_time");
		op.add(Builder::customSettings, CustomSettings.DESERIALIZER, "custom_settings");
		op.add(Builder::dailyModelSnapshotRetentionAfterDays, JsonpDeserializer.numberDeserializer(),
				"daily_model_snapshot_retention_after_days");
		op.add(Builder::dataDescription, DataDescription.DESERIALIZER, "data_description");
		op.add(Builder::datafeedConfig, Datafeed.DESERIALIZER, "datafeed_config");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::groups, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "groups");
		op.add(Builder::jobId, JsonpDeserializer.stringDeserializer(), "job_id");
		op.add(Builder::jobType, JsonpDeserializer.stringDeserializer(), "job_type");
		op.add(Builder::jobVersion, JsonpDeserializer.stringDeserializer(), "job_version");
		op.add(Builder::modelPlotConfig, ModelPlotConfig.DESERIALIZER, "model_plot_config");
		op.add(Builder::modelSnapshotId, JsonpDeserializer.stringDeserializer(), "model_snapshot_id");
		op.add(Builder::modelSnapshotRetentionDays, JsonpDeserializer.numberDeserializer(),
				"model_snapshot_retention_days");
		op.add(Builder::renormalizationWindowDays, JsonpDeserializer.numberDeserializer(),
				"renormalization_window_days");
		op.add(Builder::resultsIndexName, JsonpDeserializer.stringDeserializer(), "results_index_name");
		op.add(Builder::resultsRetentionDays, JsonpDeserializer.numberDeserializer(), "results_retention_days");

	}

}
