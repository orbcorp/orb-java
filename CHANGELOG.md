# Changelog

## 1.6.0 (2025-07-17)

Full Changelog: [v1.5.1...v1.6.0](https://github.com/orbcorp/orb-java/compare/v1.5.1...v1.6.0)

### Features

* **api:** api update ([5b452b3](https://github.com/orbcorp/orb-java/commit/5b452b33c87113691428935eaa2adb763c490260))

## 1.5.1 (2025-07-17)

Full Changelog: [v1.5.0...v1.5.1](https://github.com/orbcorp/orb-java/compare/v1.5.0...v1.5.1)

### Bug Fixes

* **client:** ensure error handling always occurs ([833326e](https://github.com/orbcorp/orb-java/commit/833326e6f35b4b8575002fc31f89f8292343a9e0))

## 1.5.0 (2025-07-16)

Full Changelog: [v1.4.0...v1.5.0](https://github.com/orbcorp/orb-java/compare/v1.4.0...v1.5.0)

### Features

* **api:** api update ([9eba618](https://github.com/orbcorp/orb-java/commit/9eba618b98aef66e37c29e9f8084ba6a4a9efd6b))


### Chores

* **internal:** allow running specific example from cli ([88917ff](https://github.com/orbcorp/orb-java/commit/88917ff0c50ec4aa1ad8ec59d34ba452fe783979))

## 1.4.0 (2025-07-16)

Full Changelog: [v1.3.0...v1.4.0](https://github.com/orbcorp/orb-java/compare/v1.3.0...v1.4.0)

### Features

* **api:** api update ([b80c170](https://github.com/orbcorp/orb-java/commit/b80c170203b1bbe44da7121d69d245ca6b5db2b8))
* **api:** api update ([52612a7](https://github.com/orbcorp/orb-java/commit/52612a73768f17c76ccfff8e5dacf9457dd08c0d))


### Chores

* **ci:** bump `actions/setup-java` to v4 ([ee43b24](https://github.com/orbcorp/orb-java/commit/ee43b240c6ca6968cca70b7c6db999c7de19b2bd))
* **ci:** ensure docs generation always succeeds ([00866a5](https://github.com/orbcorp/orb-java/commit/00866a557ba12a39d7899bc3bc0a2950094ad355))

## 1.3.0 (2025-07-08)

Full Changelog: [v1.2.0...v1.3.0](https://github.com/orbcorp/orb-java/compare/v1.2.0...v1.3.0)

### Features

* **api:** api update ([a00c440](https://github.com/orbcorp/orb-java/commit/a00c44048af7b073e3ec72ea61239f57aa46c291))

## 1.2.0 (2025-07-04)

Full Changelog: [v1.1.0...v1.2.0](https://github.com/orbcorp/orb-java/compare/v1.1.0...v1.2.0)

### Features

* **api:** api update ([0c0d055](https://github.com/orbcorp/orb-java/commit/0c0d055d53263ebe52c445e97f6e16ebab01357f))

## 1.1.0 (2025-07-02)

Full Changelog: [v1.0.0...v1.1.0](https://github.com/orbcorp/orb-java/compare/v1.0.0...v1.1.0)

### Features

* **api:** api update ([91c85d4](https://github.com/orbcorp/orb-java/commit/91c85d496a9d4e2f7597a52f193df49012bfe53b))
* **api:** api update ([e58761c](https://github.com/orbcorp/orb-java/commit/e58761cd2e36bfa66ec1f17d05428acf2299653a))
* **api:** api update ([83c2707](https://github.com/orbcorp/orb-java/commit/83c2707bc9dd85f14df2c31e2837fd6c43e3349e))
* **api:** api update ([614dfad](https://github.com/orbcorp/orb-java/commit/614dfad8313393787778319ff46860ad2c548aa5))
* **client:** add a `withOptions` method ([744d7a6](https://github.com/orbcorp/orb-java/commit/744d7a67931d92a891bea1ff58140de71fca9eb8))
* **client:** implement per-endpoint base URL support ([6172f77](https://github.com/orbcorp/orb-java/commit/6172f770b4a6ccbb41f5748aee9164f8071036d7))


### Bug Fixes

* **ci:** release-doctor — report correct token name ([d631afb](https://github.com/orbcorp/orb-java/commit/d631afbee08819fa5febba75d799ebbbc688f0b9))
* **client:** bump max requests per host to max requests (5 -&gt; 64) ([5576ea4](https://github.com/orbcorp/orb-java/commit/5576ea4d94771c0003e8f13d503cbef46a7c8221))
* **client:** don't close client on `withOptions` usage when original is gc'd ([002c10d](https://github.com/orbcorp/orb-java/commit/002c10dd581d1e95da9431baf6c157c878db04d8))


### Chores

* **ci:** enable for pull requests ([ecdbbd4](https://github.com/orbcorp/orb-java/commit/ecdbbd4212a2bcb27d7ec96013d3a6487751372c))
* **ci:** only run for pushes and fork pull requests ([cbc078a](https://github.com/orbcorp/orb-java/commit/cbc078ac5bf69fbfa3c6f165441f58cb4d493c93))
* fix formatting ([fe0ad84](https://github.com/orbcorp/orb-java/commit/fe0ad84fdeb583979218fddfc2e17d7aeab19421))


### Refactors

* **internal:** minor `ClientOptionsTest` change ([d7614c8](https://github.com/orbcorp/orb-java/commit/d7614c8bb5048cfb430094f7ae3cc877a0627aad))

## 1.0.0 (2025-06-09)

Full Changelog: [v0.57.0...v1.0.0](https://github.com/orbcorp/orb-java/compare/v0.57.0...v1.0.0)

### ⚠ BREAKING CHANGES

* **client:** breaking change to re-use types

### Features

* **api:** api update ([70f55e5](https://github.com/orbcorp/orb-java/commit/70f55e57fd7acb1d5058f4770b0e222a6aaf4fcc))
* **api:** api update ([180d51e](https://github.com/orbcorp/orb-java/commit/180d51ed43302de208c9f4208664f6a455bd5978))
* **api:** api update ([6d3367a](https://github.com/orbcorp/orb-java/commit/6d3367a305cf01dbb74c513b64a4f737b615b8d9))
* **api:** api update ([0bfa7ad](https://github.com/orbcorp/orb-java/commit/0bfa7ad4505968ced36fbaed8ab015de46c64760))
* **api:** api update ([616608c](https://github.com/orbcorp/orb-java/commit/616608cb60c88dee8de7580c2abb2031f5f6205c))
* **api:** api update ([7bbb55e](https://github.com/orbcorp/orb-java/commit/7bbb55e038c687ab12f6db551693033fe96e6bdd))
* **api:** api update ([7f05af6](https://github.com/orbcorp/orb-java/commit/7f05af623a35433d841f0d333ba7b53fa4adb693))
* **api:** manual updates ([0efca0a](https://github.com/orbcorp/orb-java/commit/0efca0a760f1f7db7ce5cd7388d02f378645e9f2))
* **api:** manual updates ([a419c35](https://github.com/orbcorp/orb-java/commit/a419c35477d728f555315d0151a788d361f67813))
* **client:** breaking change to re-use types ([ad6e081](https://github.com/orbcorp/orb-java/commit/ad6e081eb0c059369d5a11863d9a4d0fd7f6749c))


### Bug Fixes

* **internal:** cleaning up custom code ([a646246](https://github.com/orbcorp/orb-java/commit/a646246bf46caba04761d1dbdcbf0f2254a802de))
* **internal:** fix typing error ([31cc02e](https://github.com/orbcorp/orb-java/commit/31cc02e9ab39fd0f6292f73d43914f626c3dad16))


### Chores

* **internal:** codegen related update ([0907df6](https://github.com/orbcorp/orb-java/commit/0907df61778f4c5aee9f24a6d5e7a5b4d30c5d43))
* **internal:** codegen related update ([2a0fdab](https://github.com/orbcorp/orb-java/commit/2a0fdabe411a2d31333ad84e843b8f173428b168))
* **internal:** codegen related update ([1ce04bd](https://github.com/orbcorp/orb-java/commit/1ce04bdccc4ef3026fb794df0c9ecf658e328278))

## 0.57.0 (2025-05-22)

Full Changelog: [v0.56.0...v0.57.0](https://github.com/orbcorp/orb-java/compare/v0.56.0...v0.57.0)

### ⚠ BREAKING CHANGES

* **client:** improve some class names
* **client:** extract auto pagination to shared classes
* **client:** **Migration:** - If you were referencing the `AutoPager` class on a specific `*Page` or `*PageAsync` type, then you should instead reference the shared `AutoPager` and `AutoPagerAsync` types, under the `core` package
    - `AutoPagerAsync` now has different usage. You can call `.subscribe(...)` on the returned object instead to get called back each page item. You can also call `onCompleteFuture()` to get a future that completes when all items have been processed. Finally, you can call `.close()` on the returned object to stop auto-paginating early
    - If you were referencing `getNextPage` or `getNextPageParams`:
       - Swap to `nextPage()` and `nextPageParams()`
       - Note that these both now return non-optional types (use `hasNextPage()` before calling these, since they will throw if it's impossible to get another page)

### Features

* **client:** allow providing some params positionally ([7ddd872](https://github.com/orbcorp/orb-java/commit/7ddd872ee4fb49e2e3f4b6d5938bc9a5ed0e2342))
* **client:** extract auto pagination to shared classes ([9affbde](https://github.com/orbcorp/orb-java/commit/9affbdee875bdf75fa150d58ed8de23b9d51eaf2))


### Bug Fixes

* **internal:** fix name collision errors from Unit import ([1f7beef](https://github.com/orbcorp/orb-java/commit/1f7beefa05c6cb1356d1973bbcb0955f7eb65fbd))


### Performance Improvements

* **internal:** improve compilation+test speed ([f72c4ad](https://github.com/orbcorp/orb-java/commit/f72c4ad7c4604330f2ff972b517b2e3f03f5356f))


### Chores

* **ci:** only use depot for staging repos ([68dcdd8](https://github.com/orbcorp/orb-java/commit/68dcdd85f1eac797fae1136e383afae1ad5c0e28))
* **ci:** run on more branches and use depot runners ([ddcc77e](https://github.com/orbcorp/orb-java/commit/ddcc77e1835fe8ec200fbfeb5d0427ef19fb6d25))
* **docs:** grammar improvements ([7b5fb07](https://github.com/orbcorp/orb-java/commit/7b5fb07cdbe4b1ac8f41d95de243b913fce60a13))
* **internal:** codegen related update ([9df208b](https://github.com/orbcorp/orb-java/commit/9df208bf6cf18c90cc09bf1f3eba9ba1e5b4c767))
* **internal:** codegen related update ([7db8db6](https://github.com/orbcorp/orb-java/commit/7db8db63862be728dc201e36aa3ff164307c5e4e))
* **internal:** java 17 -&gt; 21 on ci ([7f2fb10](https://github.com/orbcorp/orb-java/commit/7f2fb1063cd794a4c46fb88203944d4262a0a1db))
* **internal:** remove flaky `-Xbackend-threads=0` option ([b085373](https://github.com/orbcorp/orb-java/commit/b085373fc56676f510a0b0900e8cecd2af633313))
* **internal:** update java toolchain ([2b4abdf](https://github.com/orbcorp/orb-java/commit/2b4abdff056e4bd158c6a2bc605c4ba09e4760d0))


### Documentation

* **client:** update jackson compat error message ([b3ceb27](https://github.com/orbcorp/orb-java/commit/b3ceb2741476209419bd210d7caebec7fbb5eaa7))
* explain http client customization ([31827ac](https://github.com/orbcorp/orb-java/commit/31827acf060986c871832a7619f09dae7aab1640))
* explain jackson compat in readme ([fb2505d](https://github.com/orbcorp/orb-java/commit/fb2505d8cdf9fb61589715396da17d424de5f7c0))


### Refactors

* **client:** improve some class names ([9460c52](https://github.com/orbcorp/orb-java/commit/9460c523ec5235f4b8b6335336be8e3b82b8527f))

## 0.56.0 (2025-04-09)

Full Changelog: [v0.55.0...v0.56.0](https://github.com/orbcorp/orb-java/compare/v0.55.0...v0.56.0)

### Features

* **client:** make pagination robust to missing data ([bf8c89e](https://github.com/orbcorp/orb-java/commit/bf8c89e3e5148a99afd9b9e5f211dd3002c2d88e))
* **client:** support setting base URL via env var ([#397](https://github.com/orbcorp/orb-java/issues/397)) ([4ac10b3](https://github.com/orbcorp/orb-java/commit/4ac10b3cf164a76c7da1e0c5fc12aeec0338d0d3))


### Bug Fixes

* **client:** bump to better jackson version ([#400](https://github.com/orbcorp/orb-java/issues/400)) ([b9c0a00](https://github.com/orbcorp/orb-java/commit/b9c0a00b0181bfbaf7a9a2f670b98000dfa4b996))


### Chores

* **internal:** expand CI branch coverage ([#399](https://github.com/orbcorp/orb-java/issues/399)) ([17d8399](https://github.com/orbcorp/orb-java/commit/17d8399351f5affa7a89fbc79df9e88c732c1330))
* **internal:** reduce CI branch coverage ([06a8495](https://github.com/orbcorp/orb-java/commit/06a84957b55d697cbb0bd3a8c6f9a4a02f95d90c))


### Documentation

* add comments for page methods ([bf8c89e](https://github.com/orbcorp/orb-java/commit/bf8c89e3e5148a99afd9b9e5f211dd3002c2d88e))


### Refactors

* **client:** deduplicate page response classes ([#401](https://github.com/orbcorp/orb-java/issues/401)) ([bf8c89e](https://github.com/orbcorp/orb-java/commit/bf8c89e3e5148a99afd9b9e5f211dd3002c2d88e))
* **client:** migrate pages to builder pattern ([#402](https://github.com/orbcorp/orb-java/issues/402)) ([bbcd954](https://github.com/orbcorp/orb-java/commit/bbcd9545d5fad36f5b241ecc5515b44454533265))

## 0.55.0 (2025-04-08)

Full Changelog: [v0.54.0...v0.55.0](https://github.com/orbcorp/orb-java/compare/v0.54.0...v0.55.0)

### Features

* **api:** api update ([#391](https://github.com/orbcorp/orb-java/issues/391)) ([7d1978f](https://github.com/orbcorp/orb-java/commit/7d1978fec3bc01cb0a02fff2433dcf4077469f58))


### Chores

* **internal:** codegen related update ([#393](https://github.com/orbcorp/orb-java/issues/393)) ([e941542](https://github.com/orbcorp/orb-java/commit/e941542e549401f37058816a428e6d334fa57d01))
* **tests:** improve enum examples ([#394](https://github.com/orbcorp/orb-java/issues/394)) ([f1c810a](https://github.com/orbcorp/orb-java/commit/f1c810a7fd6a67722803f9baa6182a32d0644f1f))

## 0.54.0 (2025-04-07)

Full Changelog: [v0.53.0...v0.54.0](https://github.com/orbcorp/orb-java/compare/v0.53.0...v0.54.0)

### Features

* **client:** expose request body setter and getter ([#383](https://github.com/orbcorp/orb-java/issues/383)) ([60cce59](https://github.com/orbcorp/orb-java/commit/60cce59676f05bb6698fd215eddd6a443ef371de))


### Bug Fixes

* **api:** naming for sync_payment_methods methods ([#389](https://github.com/orbcorp/orb-java/issues/389)) ([47fccba](https://github.com/orbcorp/orb-java/commit/47fccbaa464aec02b7565f1a13de1290b8a7dc1c))


### Chores

* **internal:** codegen related update ([#385](https://github.com/orbcorp/orb-java/issues/385)) ([067d5dd](https://github.com/orbcorp/orb-java/commit/067d5ddb279fa50654b8d8fac4bfe65e8f6890fc))
* **internal:** codegen related update ([#387](https://github.com/orbcorp/orb-java/issues/387)) ([9040df4](https://github.com/orbcorp/orb-java/commit/9040df44c2ecafd678ec8a7f6588d4309e853d0d))
* **internal:** swap from `getNullable` to `getOptional` ([#386](https://github.com/orbcorp/orb-java/issues/386)) ([6a6bc6d](https://github.com/orbcorp/orb-java/commit/6a6bc6d7a59e06c0fd78f4abbcd40eca0c845117))


### Documentation

* document how to forcibly omit required field ([1090267](https://github.com/orbcorp/orb-java/commit/1090267178944bab500401a8b4f2f21ec2869324))
* swap examples used in readme ([#388](https://github.com/orbcorp/orb-java/issues/388)) ([1090267](https://github.com/orbcorp/orb-java/commit/1090267178944bab500401a8b4f2f21ec2869324))

## 0.53.0 (2025-04-02)

Full Changelog: [v0.52.2...v0.53.0](https://github.com/orbcorp/orb-java/compare/v0.52.2...v0.53.0)

### Features

* **client:** add enum validation method ([d6fdaa3](https://github.com/orbcorp/orb-java/commit/d6fdaa34309a8c1bcc4f2bd84beaae587f3a3e9d))
* **client:** make union deserialization more robust ([#379](https://github.com/orbcorp/orb-java/issues/379)) ([d6fdaa3](https://github.com/orbcorp/orb-java/commit/d6fdaa34309a8c1bcc4f2bd84beaae587f3a3e9d))


### Chores

* **client:** remove unnecessary json state from some query param classes ([d6fdaa3](https://github.com/orbcorp/orb-java/commit/d6fdaa34309a8c1bcc4f2bd84beaae587f3a3e9d))
* **internal:** add invalid json deserialization tests ([d6fdaa3](https://github.com/orbcorp/orb-java/commit/d6fdaa34309a8c1bcc4f2bd84beaae587f3a3e9d))
* **internal:** add json roundtripping tests ([d6fdaa3](https://github.com/orbcorp/orb-java/commit/d6fdaa34309a8c1bcc4f2bd84beaae587f3a3e9d))
* **internal:** codegen related update ([#381](https://github.com/orbcorp/orb-java/issues/381)) ([1373dc9](https://github.com/orbcorp/orb-java/commit/1373dc9c246351e40eb442e4af9af81c1b8cb881))

## 0.52.2 (2025-04-01)

Full Changelog: [v0.52.1...v0.52.2](https://github.com/orbcorp/orb-java/compare/v0.52.1...v0.52.2)

### Bug Fixes

* pluralize `list` response variables ([#377](https://github.com/orbcorp/orb-java/issues/377)) ([a5c3fd9](https://github.com/orbcorp/orb-java/commit/a5c3fd99651cab3397ec6233647e011a5468f3b7))


### Chores

* **internal:** codegen related update ([#376](https://github.com/orbcorp/orb-java/issues/376)) ([bb5383e](https://github.com/orbcorp/orb-java/commit/bb5383eca5483d294c9864d04fa767ae9de1d7e1))
* **internal:** version bump ([#374](https://github.com/orbcorp/orb-java/issues/374)) ([1ae8e22](https://github.com/orbcorp/orb-java/commit/1ae8e22edff40a5be261fdc2d7ba71860f3a7d42))

## 0.52.1 (2025-03-31)

Full Changelog: [v0.52.0...v0.52.1](https://github.com/orbcorp/orb-java/compare/v0.52.0...v0.52.1)

### Bug Fixes

* **client:** limit json deserialization coercion ([#373](https://github.com/orbcorp/orb-java/issues/373)) ([654e81c](https://github.com/orbcorp/orb-java/commit/654e81cf520631050936ae5cf9397c0e4a9cf02b))


### Chores

* **internal:** codegen related update ([#371](https://github.com/orbcorp/orb-java/issues/371)) ([28dbf0a](https://github.com/orbcorp/orb-java/commit/28dbf0a107b892656275633f3805eb2d3c7f93fa))

## 0.52.0 (2025-03-26)

Full Changelog: [v0.51.0...v0.52.0](https://github.com/orbcorp/orb-java/compare/v0.51.0...v0.52.0)

### Features

* **client:** support a lower jackson version ([#368](https://github.com/orbcorp/orb-java/issues/368)) ([659e62b](https://github.com/orbcorp/orb-java/commit/659e62bfba72b4fbf261db18cbcc4ced30f7953d))
* **client:** throw on incompatible jackson version ([659e62b](https://github.com/orbcorp/orb-java/commit/659e62bfba72b4fbf261db18cbcc4ced30f7953d))


### Bug Fixes

* **client:** map deserialization bug ([da01e21](https://github.com/orbcorp/orb-java/commit/da01e21aab23d7a6b429cbc1c96f48354ca2f0ca))


### Chores

* **internal:** delete unused methods and annotations ([#369](https://github.com/orbcorp/orb-java/issues/369)) ([da01e21](https://github.com/orbcorp/orb-java/commit/da01e21aab23d7a6b429cbc1c96f48354ca2f0ca))
* **internal:** fix example formatting ([#364](https://github.com/orbcorp/orb-java/issues/364)) ([99e8b5b](https://github.com/orbcorp/orb-java/commit/99e8b5b46b1cba17b06d5fa92fcf8e084d64f6b3))
* **internal:** make multipart assertions more robust ([4f4527e](https://github.com/orbcorp/orb-java/commit/4f4527eaa976d407948d20998b46bc1489c86b2c))
* **internal:** remove unnecessary `assertNotNull` calls ([4f4527e](https://github.com/orbcorp/orb-java/commit/4f4527eaa976d407948d20998b46bc1489c86b2c))
* **internal:** remove unnecessary import ([#365](https://github.com/orbcorp/orb-java/issues/365)) ([3a0fe1e](https://github.com/orbcorp/orb-java/commit/3a0fe1e9bf719ef3606c30ff48ba6a7dd06f7911))


### Documentation

* minor readme tweak ([#367](https://github.com/orbcorp/orb-java/issues/367)) ([bc3f6c3](https://github.com/orbcorp/orb-java/commit/bc3f6c3c810124041192a841b531039b27cfb840))
* refine comments on multipart params ([#362](https://github.com/orbcorp/orb-java/issues/362)) ([4f4527e](https://github.com/orbcorp/orb-java/commit/4f4527eaa976d407948d20998b46bc1489c86b2c))
* update readme exception docs ([#366](https://github.com/orbcorp/orb-java/issues/366)) ([9443b23](https://github.com/orbcorp/orb-java/commit/9443b239a271eb97bf16f5d8cd432f6c97db2aa4))

## 0.51.0 (2025-03-20)

Full Changelog: [v0.50.0...v0.51.0](https://github.com/orbcorp/orb-java/compare/v0.50.0...v0.51.0)

### Features

* **api:** api update ([#359](https://github.com/orbcorp/orb-java/issues/359)) ([bddb41b](https://github.com/orbcorp/orb-java/commit/bddb41bcc73df524ebce5c1815a2b4b609b98272))

## 0.50.0 (2025-03-19)

Full Changelog: [v0.49.1...v0.50.0](https://github.com/orbcorp/orb-java/compare/v0.49.1...v0.50.0)

### ⚠ BREAKING CHANGES

* **client:** refactor exception structure and methods ([#357](https://github.com/orbcorp/orb-java/issues/357))

### Bug Fixes

* compilation error ([287236c](https://github.com/orbcorp/orb-java/commit/287236c510b6351aa98f68abce900ad40f824537))


### Chores

* **client:** refactor exception structure and methods ([#357](https://github.com/orbcorp/orb-java/issues/357)) ([adc2898](https://github.com/orbcorp/orb-java/commit/adc28986adf95bb668ba4b4176fcd3c4b3507ca6))
* **internal:** codegen related update ([#356](https://github.com/orbcorp/orb-java/issues/356)) ([56e24bf](https://github.com/orbcorp/orb-java/commit/56e24bf8cdaf22d81e15d59bd0d5c2611729050e))
* **internal:** refactor enum query param serialization ([#353](https://github.com/orbcorp/orb-java/issues/353)) ([06904bf](https://github.com/orbcorp/orb-java/commit/06904bf13668ca9cb0cc9713a12c1b21811dbaa1))
* **internal:** version bump ([#354](https://github.com/orbcorp/orb-java/issues/354)) ([8d4d3e1](https://github.com/orbcorp/orb-java/commit/8d4d3e1e02c9547ad12254a8057294ff9c98de79))

## 0.49.1 (2025-03-18)

Full Changelog: [v0.49.0...v0.49.1](https://github.com/orbcorp/orb-java/compare/v0.49.0...v0.49.1)

### Bug Fixes

* **client:** support kotlin 1.8 runtime ([#352](https://github.com/orbcorp/orb-java/issues/352)) ([55893cb](https://github.com/orbcorp/orb-java/commit/55893cbb45d77cfff23961bffdd18d43423f8aee))


### Chores

* **internal:** add generated comment ([#346](https://github.com/orbcorp/orb-java/issues/346)) ([670dae5](https://github.com/orbcorp/orb-java/commit/670dae56117f901c72b1b925a3e350e2b59d2dc4))
* **internal:** add some tests for union classes ([#351](https://github.com/orbcorp/orb-java/issues/351)) ([8daea2a](https://github.com/orbcorp/orb-java/commit/8daea2a50c34866564f1eb9e04cdae4bc6bbd2a2))
* **internal:** delete duplicate tests ([a2ae257](https://github.com/orbcorp/orb-java/commit/a2ae25777f691b41232cb8a6e13aa8a502da1c8c))
* **internal:** generate more tests ([399f1ce](https://github.com/orbcorp/orb-java/commit/399f1ce0a2efcc7846cc0c4783178f8529a36207))
* **internal:** make test classes internal ([#345](https://github.com/orbcorp/orb-java/issues/345)) ([8566c48](https://github.com/orbcorp/orb-java/commit/8566c482616da4e427c0d1625f0585b3d796a628))
* **internal:** refactor query param serialization impl and tests ([#348](https://github.com/orbcorp/orb-java/issues/348)) ([15e112d](https://github.com/orbcorp/orb-java/commit/15e112d3c1450ddfaa329cd921f052e3f34f37dc))
* **internal:** refactor some test assertions ([a2ae257](https://github.com/orbcorp/orb-java/commit/a2ae25777f691b41232cb8a6e13aa8a502da1c8c))
* **internal:** reformat some tests ([#350](https://github.com/orbcorp/orb-java/issues/350)) ([399f1ce](https://github.com/orbcorp/orb-java/commit/399f1ce0a2efcc7846cc0c4783178f8529a36207))
* **internal:** rename `getPathParam` ([#349](https://github.com/orbcorp/orb-java/issues/349)) ([a2ae257](https://github.com/orbcorp/orb-java/commit/a2ae25777f691b41232cb8a6e13aa8a502da1c8c))
* **internal:** reorder some params methodsc ([a2ae257](https://github.com/orbcorp/orb-java/commit/a2ae25777f691b41232cb8a6e13aa8a502da1c8c))


### Documentation

* add `build` method comments ([#347](https://github.com/orbcorp/orb-java/issues/347)) ([0dcf1be](https://github.com/orbcorp/orb-java/commit/0dcf1bebf6db9e9c5f2e0d3606a1acab2b85adce))
* deduplicate and refine comments ([#343](https://github.com/orbcorp/orb-java/issues/343)) ([483df7c](https://github.com/orbcorp/orb-java/commit/483df7c06115b3a5584b939e1f640a1b618abd79))

## 0.49.0 (2025-03-14)

Full Changelog: [v0.48.0...v0.49.0](https://github.com/orbcorp/orb-java/compare/v0.48.0...v0.49.0)

### Features

* **api:** api update ([#341](https://github.com/orbcorp/orb-java/issues/341)) ([3d8a83b](https://github.com/orbcorp/orb-java/commit/3d8a83bab9ac6fe453be2450ee0db32ee07c16c9))


### Chores

* **api:** correctly support ExternalCustomerID array filter on Subscriptions.List ([#340](https://github.com/orbcorp/orb-java/issues/340)) ([f5c8c0b](https://github.com/orbcorp/orb-java/commit/f5c8c0b4e7debfa773bc040831fa9935ca981215))
* **internal:** remove extra empty newlines ([#338](https://github.com/orbcorp/orb-java/issues/338)) ([fb8b1a2](https://github.com/orbcorp/orb-java/commit/fb8b1a215c5397eef151a4dc0d33810b37c745b8))

## 0.48.0 (2025-03-11)

Full Changelog: [v0.47.0...v0.48.0](https://github.com/orbcorp/orb-java/compare/v0.47.0...v0.48.0)

### Features

* **api:** api update ([#336](https://github.com/orbcorp/orb-java/issues/336)) ([328aa62](https://github.com/orbcorp/orb-java/commit/328aa621e91be9f5bbf078a6f068529f17da889a))


### Chores

* **internal:** codegen related update ([#333](https://github.com/orbcorp/orb-java/issues/333)) ([bd596c4](https://github.com/orbcorp/orb-java/commit/bd596c44a076d9806cf7661974f53f508a581d4f))
* **internal:** codegen related update ([#335](https://github.com/orbcorp/orb-java/issues/335)) ([4784160](https://github.com/orbcorp/orb-java/commit/4784160c237cfe0dae76f40fae520473cb912d12))

## 0.47.0 (2025-03-10)

Full Changelog: [v0.46.1...v0.47.0](https://github.com/orbcorp/orb-java/compare/v0.46.1...v0.47.0)

### Features

* **api:** api update ([#331](https://github.com/orbcorp/orb-java/issues/331)) ([6aea587](https://github.com/orbcorp/orb-java/commit/6aea5874c48a82b78b072e04f5773bb07ed896b6))


### Chores

* **internal:** don't use `JvmOverloads` in interfaces ([19acfcf](https://github.com/orbcorp/orb-java/commit/19acfcfd105bacde55593bc1d6d7b1c9621fc996))
* **internal:** reenable warnings as errors ([#327](https://github.com/orbcorp/orb-java/issues/327)) ([19acfcf](https://github.com/orbcorp/orb-java/commit/19acfcfd105bacde55593bc1d6d7b1c9621fc996))


### Documentation

* document `JsonValue` construction in readme ([#330](https://github.com/orbcorp/orb-java/issues/330)) ([9401e34](https://github.com/orbcorp/orb-java/commit/9401e349149fe4cbc37ee2174e8609cf60d107b0))
* revise readme docs about nested params ([#329](https://github.com/orbcorp/orb-java/issues/329)) ([9a2a812](https://github.com/orbcorp/orb-java/commit/9a2a812cc9aa3b4ab369a28784e0afaaf37badb4))

## 0.46.1 (2025-03-07)

Full Changelog: [v0.46.0...v0.46.1](https://github.com/orbcorp/orb-java/compare/v0.46.0...v0.46.1)

### Chores

* **internal:** add `.kotlin` to `.gitignore` ([#323](https://github.com/orbcorp/orb-java/issues/323)) ([8c1f105](https://github.com/orbcorp/orb-java/commit/8c1f105f073072041491eeffed999a31957c4c5e))
* **internal:** codegen related update ([#321](https://github.com/orbcorp/orb-java/issues/321)) ([a45ffe2](https://github.com/orbcorp/orb-java/commit/a45ffe29a6f89939a7c624efac74e5ce890ca7d9))
* **internal:** don't generate docs ([#325](https://github.com/orbcorp/orb-java/issues/325)) ([dccfa35](https://github.com/orbcorp/orb-java/commit/dccfa351f867c99eddac02c5603ac59cf892a7ef))
* **internal:** use `getOrNull` instead of `orElse(null)` ([#324](https://github.com/orbcorp/orb-java/issues/324)) ([02fd429](https://github.com/orbcorp/orb-java/commit/02fd429784de8fe4a0ae0d4eee9fbe1544080c92))

## 0.46.0 (2025-03-07)

Full Changelog: [v0.45.0...v0.46.0](https://github.com/orbcorp/orb-java/compare/v0.45.0...v0.46.0)

### Features

* generate and publish docs ([#320](https://github.com/orbcorp/orb-java/issues/320)) ([44c1bcd](https://github.com/orbcorp/orb-java/commit/44c1bcdd24a8a5500c32b4a21376a2a3a110555c))


### Bug Fixes

* compilation error ([a4cfad1](https://github.com/orbcorp/orb-java/commit/a4cfad1e038849dcf0c81888d1acd9401cc28073))

## 0.45.0 (2025-03-07)

Full Changelog: [v0.44.0...v0.45.0](https://github.com/orbcorp/orb-java/compare/v0.44.0...v0.45.0)

### Features

* **api:** api update ([#317](https://github.com/orbcorp/orb-java/issues/317)) ([540fe9c](https://github.com/orbcorp/orb-java/commit/540fe9cfb9c92531ee1c517d06c3401f3b4511a1))
* **client:** detect binary incompatible jackson versions ([#315](https://github.com/orbcorp/orb-java/issues/315)) ([50dd8a9](https://github.com/orbcorp/orb-java/commit/50dd8a98c468428cc2598ba4ce5d561a615b736e))

## 0.44.0 (2025-03-06)

Full Changelog: [v0.43.0...v0.44.0](https://github.com/orbcorp/orb-java/compare/v0.43.0...v0.44.0)

### Features

* **api:** api update ([#313](https://github.com/orbcorp/orb-java/issues/313)) ([6121464](https://github.com/orbcorp/orb-java/commit/6121464c0d089981492bf90573d1c11590780def))
* **client:** accept `InputStream` and `Path` for file params ([#311](https://github.com/orbcorp/orb-java/issues/311)) ([11ca664](https://github.com/orbcorp/orb-java/commit/11ca66491b29b9996bbffa2b599aed9c22d32ee8))

## 0.43.0 (2025-03-05)

Full Changelog: [v0.42.0...v0.43.0](https://github.com/orbcorp/orb-java/compare/v0.42.0...v0.43.0)

### Features

* **api:** manual updates ([#308](https://github.com/orbcorp/orb-java/issues/308)) ([585053c](https://github.com/orbcorp/orb-java/commit/585053c5b95cce50f8e8489596292349ba02a9f0))

## 0.42.0 (2025-03-05)

Full Changelog: [v0.41.0...v0.42.0](https://github.com/orbcorp/orb-java/compare/v0.41.0...v0.42.0)

### Features

* **api:** manual updates ([#305](https://github.com/orbcorp/orb-java/issues/305)) ([14c52ec](https://github.com/orbcorp/orb-java/commit/14c52ecdb2cb3968fc4d7e387317b405dc2b8867))

## 0.41.0 (2025-03-05)

Full Changelog: [v0.40.0...v0.41.0](https://github.com/orbcorp/orb-java/compare/v0.40.0...v0.41.0)

### Features

* **api:** manual updates ([#302](https://github.com/orbcorp/orb-java/issues/302)) ([7a1af02](https://github.com/orbcorp/orb-java/commit/7a1af0246f59264948bcf6aa03c9e91e039c68ab))

## 0.40.0 (2025-03-05)

Full Changelog: [v0.39.0...v0.40.0](https://github.com/orbcorp/orb-java/compare/v0.39.0...v0.40.0)

### ⚠ BREAKING CHANGES

* **client:** refactor multipart formdata impl ([#296](https://github.com/orbcorp/orb-java/issues/296))

### Features

* **api:** api update ([#300](https://github.com/orbcorp/orb-java/issues/300)) ([d5cb74a](https://github.com/orbcorp/orb-java/commit/d5cb74a47458809ba335447204b1b21166df0ede))
* **client:** allow configuring timeouts granularly ([#294](https://github.com/orbcorp/orb-java/issues/294)) ([fd71049](https://github.com/orbcorp/orb-java/commit/fd7104918a50f62d44769d167cd3d0c665710c5e))
* **client:** support raw response access ([#295](https://github.com/orbcorp/orb-java/issues/295)) ([70b0eb8](https://github.com/orbcorp/orb-java/commit/70b0eb8d409fdf3c4c1369d089c9c0f52f674268))


### Chores

* **client:** expose `Optional`, not nullable, from `ClientOptions` ([#299](https://github.com/orbcorp/orb-java/issues/299)) ([20f1914](https://github.com/orbcorp/orb-java/commit/20f191444e7d58a9ed38174f7a7f5ce027e39101))
* **client:** refactor multipart formdata impl ([#296](https://github.com/orbcorp/orb-java/issues/296)) ([22e538b](https://github.com/orbcorp/orb-java/commit/22e538b1422b5bef07a22d0d84bf4a86dd77cea1))
* **internal:** refactor `ErrorHandlingTest` ([#292](https://github.com/orbcorp/orb-java/issues/292)) ([d1ec6ff](https://github.com/orbcorp/orb-java/commit/d1ec6ff7570f4751c55862bd687009ff1f9e4b74))


### Documentation

* add raw response readme documentation ([#297](https://github.com/orbcorp/orb-java/issues/297)) ([648e2e6](https://github.com/orbcorp/orb-java/commit/648e2e6fe04d533a22fdbd730d84a39705f85561))
* note required fields in `builder` javadoc ([#298](https://github.com/orbcorp/orb-java/issues/298)) ([1af73ac](https://github.com/orbcorp/orb-java/commit/1af73ac23511ae32f4c4c051c45e95384cbb7c25))

## 0.39.0 (2025-03-01)

Full Changelog: [v0.38.0...v0.39.0](https://github.com/orbcorp/orb-java/compare/v0.38.0...v0.39.0)

### Features

* **api:** api update ([#290](https://github.com/orbcorp/orb-java/issues/290)) ([e5a73e7](https://github.com/orbcorp/orb-java/commit/e5a73e781835f7d036324b85209f8386083f8d96))


### Documentation

* update URLs from stainlessapi.com to stainless.com ([#288](https://github.com/orbcorp/orb-java/issues/288)) ([c69a113](https://github.com/orbcorp/orb-java/commit/c69a11395282576f531395c7ec26a04d789a03d9))

## 0.38.0 (2025-02-27)

Full Changelog: [v0.37.0...v0.38.0](https://github.com/orbcorp/orb-java/compare/v0.37.0...v0.38.0)

### Features

* **api:** api update ([#286](https://github.com/orbcorp/orb-java/issues/286)) ([a0ba171](https://github.com/orbcorp/orb-java/commit/a0ba171d068ac12040aa4081a3985db0e2f0f4e3))


### Chores

* **client:** use deep identity methods for primitive array types ([#283](https://github.com/orbcorp/orb-java/issues/283)) ([6e2862d](https://github.com/orbcorp/orb-java/commit/6e2862d364872246891f5b1f37a137f27edd3c39))
* **internal:** add async service tests ([#281](https://github.com/orbcorp/orb-java/issues/281)) ([8171ba6](https://github.com/orbcorp/orb-java/commit/8171ba671b8a5fb9d55477984a765f7235d50c53))
* **internal:** improve sync service tests ([8171ba6](https://github.com/orbcorp/orb-java/commit/8171ba671b8a5fb9d55477984a765f7235d50c53))
* **internal:** refactor `ServiceParamsTest` ([#285](https://github.com/orbcorp/orb-java/issues/285)) ([7894edb](https://github.com/orbcorp/orb-java/commit/7894edb4bd1b2a0780d839c23e08861e10aa080e))


### Documentation

* readme parameter tweaks ([8171ba6](https://github.com/orbcorp/orb-java/commit/8171ba671b8a5fb9d55477984a765f7235d50c53))

## 0.37.0 (2025-02-26)

Full Changelog: [v0.36.0...v0.37.0](https://github.com/orbcorp/orb-java/compare/v0.36.0...v0.37.0)

### Features

* **client:** allow omitting params object when none required ([#277](https://github.com/orbcorp/orb-java/issues/277)) ([7966838](https://github.com/orbcorp/orb-java/commit/7966838abd9d39b9cdcb3d5411880641f164b98c))


### Bug Fixes

* **client:** add missing `@JvmStatic` ([#279](https://github.com/orbcorp/orb-java/issues/279)) ([6563ba6](https://github.com/orbcorp/orb-java/commit/6563ba61a5a4a68e4f193dd678fec79c0c1e6170))

## 0.36.0 (2025-02-25)

Full Changelog: [v0.35.0...v0.36.0](https://github.com/orbcorp/orb-java/compare/v0.35.0...v0.36.0)

### Features

* **api:** api update ([#275](https://github.com/orbcorp/orb-java/issues/275)) ([95cfdb0](https://github.com/orbcorp/orb-java/commit/95cfdb0dcfe68e9fa46832c8de1e2dad4740f867))


### Documentation

* add source file links to readme ([#273](https://github.com/orbcorp/orb-java/issues/273)) ([b936d21](https://github.com/orbcorp/orb-java/commit/b936d219b3bbd547dc9e8a37772ddd61d0ef4784))

## 0.35.0 (2025-02-21)

Full Changelog: [v0.34.0...v0.35.0](https://github.com/orbcorp/orb-java/compare/v0.34.0...v0.35.0)

### Features

* **api:** api update ([#270](https://github.com/orbcorp/orb-java/issues/270)) ([13d68f1](https://github.com/orbcorp/orb-java/commit/13d68f1f97cf56633b6e3a17286d927f6d6a327b))

## 0.34.0 (2025-02-21)

Full Changelog: [v0.33.0...v0.34.0](https://github.com/orbcorp/orb-java/compare/v0.33.0...v0.34.0)

### Features

* **api:** api update ([#267](https://github.com/orbcorp/orb-java/issues/267)) ([86b3d21](https://github.com/orbcorp/orb-java/commit/86b3d21061f206a1e5c3b2a8f07f6208a25be608))

## 0.33.0 (2025-02-20)

Full Changelog: [v0.32.0...v0.33.0](https://github.com/orbcorp/orb-java/compare/v0.32.0...v0.33.0)

### Features

* **api:** api update ([#264](https://github.com/orbcorp/orb-java/issues/264)) ([49f679f](https://github.com/orbcorp/orb-java/commit/49f679f62e3fa725e68c45d6c43a3ec9021deb8d))
* **client:** get rid of annoying checked exceptions ([#260](https://github.com/orbcorp/orb-java/issues/260)) ([ffc9682](https://github.com/orbcorp/orb-java/commit/ffc968253c1b7ea7d8694edadddd0d9bfc0a267d))


### Bug Fixes

* **client:** mark some request bodies as optional ([#263](https://github.com/orbcorp/orb-java/issues/263)) ([c6f1170](https://github.com/orbcorp/orb-java/commit/c6f11707fd576970378f6d24e41829cb6dcbce36))


### Chores

* **docs:** add faq to readme ([#262](https://github.com/orbcorp/orb-java/issues/262)) ([67226ff](https://github.com/orbcorp/orb-java/commit/67226ffb755caaa59df0771cfb3443a31dc7d16f))
* **internal:** remove unnecessary non-null asserts in tests ([c6f1170](https://github.com/orbcorp/orb-java/commit/c6f11707fd576970378f6d24e41829cb6dcbce36))
* **internal:** use `assertNotNull` in tests for type narrowing ([c6f1170](https://github.com/orbcorp/orb-java/commit/c6f11707fd576970378f6d24e41829cb6dcbce36))


### Documentation

* add immutability explanation to readme ([#265](https://github.com/orbcorp/orb-java/issues/265)) ([2fee757](https://github.com/orbcorp/orb-java/commit/2fee7570279fb4b446d159b272f056b9fa33c8b6))

## 0.32.0 (2025-02-20)

Full Changelog: [v0.31.1...v0.32.0](https://github.com/orbcorp/orb-java/compare/v0.31.1...v0.32.0)

### Features

* **api:** api update ([#258](https://github.com/orbcorp/orb-java/issues/258)) ([859dff9](https://github.com/orbcorp/orb-java/commit/859dff93cc6853596d6cdbf9965f4a652b0c8512))
* **client:** support `JsonField#asX()` for known values ([#253](https://github.com/orbcorp/orb-java/issues/253)) ([95dc5c6](https://github.com/orbcorp/orb-java/commit/95dc5c66f67fc8e4203ee1c4e09e6754abe1ba5d))
* **client:** update enum `asX` methods ([#251](https://github.com/orbcorp/orb-java/issues/251)) ([87ebe15](https://github.com/orbcorp/orb-java/commit/87ebe150ac6bc0f41a39547a74643f9d8dd874fb))


### Chores

* **ci:** update gradle actions to v4 ([#257](https://github.com/orbcorp/orb-java/issues/257)) ([b11b2bc](https://github.com/orbcorp/orb-java/commit/b11b2bc74f2299c6750aac8c530102083b6d0baf))
* **docs:** reorganize readme ([#254](https://github.com/orbcorp/orb-java/issues/254)) ([7c807a4](https://github.com/orbcorp/orb-java/commit/7c807a48721deda21de639d4da5f6759d23a4ddd))
* **internal:** get rid of configuration cache ([#256](https://github.com/orbcorp/orb-java/issues/256)) ([2315c82](https://github.com/orbcorp/orb-java/commit/2315c827bbf423eb0d4df9b28b71e318634dc1b9))
* **internal:** update some formatting in `Values.kt` ([95dc5c6](https://github.com/orbcorp/orb-java/commit/95dc5c66f67fc8e4203ee1c4e09e6754abe1ba5d))

## 0.31.1 (2025-02-17)

Full Changelog: [v0.31.0...v0.31.1](https://github.com/orbcorp/orb-java/compare/v0.31.0...v0.31.1)

### Bug Fixes

* format webhooks ([143457b](https://github.com/orbcorp/orb-java/commit/143457bb6f9d9953def62bddc78e09ad6f42c158))


### Chores

* **internal:** make body class constructors private ([3a15ffd](https://github.com/orbcorp/orb-java/commit/3a15ffd13a547878c837c9ef6dbf4b555c9e1255))
* **internal:** make body classes for multipart requests ([3a15ffd](https://github.com/orbcorp/orb-java/commit/3a15ffd13a547878c837c9ef6dbf4b555c9e1255))
* **internal:** misc formatting changes ([3a15ffd](https://github.com/orbcorp/orb-java/commit/3a15ffd13a547878c837c9ef6dbf4b555c9e1255))
* **internal:** optimize build and test perf ([be128e3](https://github.com/orbcorp/orb-java/commit/be128e35f2113a4e96a1c52171cc83cfe66bce74))
* **internal:** rename internal body classes ([3a15ffd](https://github.com/orbcorp/orb-java/commit/3a15ffd13a547878c837c9ef6dbf4b555c9e1255))
* **internal:** update formatter ([#247](https://github.com/orbcorp/orb-java/issues/247)) ([be128e3](https://github.com/orbcorp/orb-java/commit/be128e35f2113a4e96a1c52171cc83cfe66bce74))
* **internal:** use better test example values ([#249](https://github.com/orbcorp/orb-java/issues/249)) ([3a15ffd](https://github.com/orbcorp/orb-java/commit/3a15ffd13a547878c837c9ef6dbf4b555c9e1255))

## 0.31.0 (2025-02-14)

Full Changelog: [v0.30.0...v0.31.0](https://github.com/orbcorp/orb-java/compare/v0.30.0...v0.31.0)

### Features

* **api:** api update ([#244](https://github.com/orbcorp/orb-java/issues/244)) ([3ee3541](https://github.com/orbcorp/orb-java/commit/3ee35418c92c0a65f2d8c8ac304f98d49dff33ce))

## 0.30.0 (2025-02-13)

Full Changelog: [v0.29.0...v0.30.0](https://github.com/orbcorp/orb-java/compare/v0.29.0...v0.30.0)

### Features

* **api:** api update ([#242](https://github.com/orbcorp/orb-java/issues/242)) ([afd09a2](https://github.com/orbcorp/orb-java/commit/afd09a2df799a43abd800dd5f8010a6de74cf444))


### Chores

* **internal:** refactor `PhantomReachableClosingAsyncStreamResponse` impl ([#240](https://github.com/orbcorp/orb-java/issues/240)) ([fbf592c](https://github.com/orbcorp/orb-java/commit/fbf592c2a7e0cec9b94c85a3cfd91db996f23d06))


### Documentation

* add more phantom reachability docs ([fbf592c](https://github.com/orbcorp/orb-java/commit/fbf592c2a7e0cec9b94c85a3cfd91db996f23d06))

## 0.29.0 (2025-02-11)

Full Changelog: [v0.28.0...v0.29.0](https://github.com/orbcorp/orb-java/compare/v0.28.0...v0.29.0)

### Features

* **api:** api update ([#237](https://github.com/orbcorp/orb-java/issues/237)) ([0db4e84](https://github.com/orbcorp/orb-java/commit/0db4e846eefbc6a22b9edde37b7f9821b33d3f95))

## 0.28.0 (2025-02-07)

Full Changelog: [v0.27.1...v0.28.0](https://github.com/orbcorp/orb-java/compare/v0.27.1...v0.28.0)

### Features

* **api:** api update ([#234](https://github.com/orbcorp/orb-java/issues/234)) ([c163abf](https://github.com/orbcorp/orb-java/commit/c163abf586ec32dba615c0e1560eee1ce3f9bb57))

## 0.27.1 (2025-02-05)

Full Changelog: [v0.27.0...v0.27.1](https://github.com/orbcorp/orb-java/compare/v0.27.0...v0.27.1)

### Bug Fixes

* **api:** add missing `@MustBeClosed` annotations ([#231](https://github.com/orbcorp/orb-java/issues/231)) ([bc11828](https://github.com/orbcorp/orb-java/commit/bc11828c79268b321e6940c2f894af5a7c306cc4))
* **api:** switch `CompletableFuture&lt;Void&gt;` to `CompletableFuture<Void?>` ([bc11828](https://github.com/orbcorp/orb-java/commit/bc11828c79268b321e6940c2f894af5a7c306cc4))
* **client:** add missing validation calls on response ([bc11828](https://github.com/orbcorp/orb-java/commit/bc11828c79268b321e6940c2f894af5a7c306cc4))
* **client:** always provide a body for `PATCH` methods ([bc11828](https://github.com/orbcorp/orb-java/commit/bc11828c79268b321e6940c2f894af5a7c306cc4))


### Chores

* **internal:** minor formatting/style changes ([bc11828](https://github.com/orbcorp/orb-java/commit/bc11828c79268b321e6940c2f894af5a7c306cc4))
* **internal:** rename some tests ([bc11828](https://github.com/orbcorp/orb-java/commit/bc11828c79268b321e6940c2f894af5a7c306cc4))

## 0.27.0 (2025-02-04)

Full Changelog: [v0.26.0...v0.27.0](https://github.com/orbcorp/orb-java/compare/v0.26.0...v0.27.0)

### Features

* **api:** api update ([#229](https://github.com/orbcorp/orb-java/issues/229)) ([a0b4d91](https://github.com/orbcorp/orb-java/commit/a0b4d9178723acb177202d88d4355ae8d4dd3196))
* **client:** send client-side timeout headers ([#228](https://github.com/orbcorp/orb-java/issues/228)) ([720ac83](https://github.com/orbcorp/orb-java/commit/720ac83e1167d1c24dd71e2d2b7b98b0390c0f17))


### Chores

* **internal:** codegen related update ([#224](https://github.com/orbcorp/orb-java/issues/224)) ([ba91826](https://github.com/orbcorp/orb-java/commit/ba91826dde6c642771682ce5b56f61638bcab7a5))


### Documentation

* fix incorrect additional properties info ([#227](https://github.com/orbcorp/orb-java/issues/227)) ([8fe2133](https://github.com/orbcorp/orb-java/commit/8fe2133556f1cd283180a045f47a084b40664502))

## 0.26.0 (2025-01-30)

Full Changelog: [v0.25.0...v0.26.0](https://github.com/orbcorp/orb-java/compare/v0.25.0...v0.26.0)

### Features

* **api:** api update ([#222](https://github.com/orbcorp/orb-java/issues/222)) ([91cf3b9](https://github.com/orbcorp/orb-java/commit/91cf3b98866b16ce93da2db1381631b01f8eb865))


### Chores

* **internal:** codegen related update ([#217](https://github.com/orbcorp/orb-java/issues/217)) ([648708a](https://github.com/orbcorp/orb-java/commit/648708a1c05f37147b1dfefcb1a9f9e6774296b6))
* **internal:** codegen related update ([#220](https://github.com/orbcorp/orb-java/issues/220)) ([6975f2c](https://github.com/orbcorp/orb-java/commit/6975f2c9cfa3661ee487a8941d1fc22c0de7e5d7))
* **internal:** codegen related update ([#221](https://github.com/orbcorp/orb-java/issues/221)) ([61fa6a7](https://github.com/orbcorp/orb-java/commit/61fa6a7956a5849b58d4210f73debcc823c9d43e))
* **internal:** swap `checkNotNull` to `checkRequired` ([#219](https://github.com/orbcorp/orb-java/issues/219)) ([c77af54](https://github.com/orbcorp/orb-java/commit/c77af5465b01148fb1c84c0612e11fef5e0433c5))

## 0.25.0 (2025-01-23)

Full Changelog: [v0.24.0...v0.25.0](https://github.com/orbcorp/orb-java/compare/v0.24.0...v0.25.0)

### Features

* **api:** api update ([#214](https://github.com/orbcorp/orb-java/issues/214)) ([61cd540](https://github.com/orbcorp/orb-java/commit/61cd540dc6be6fc1b7384ff67a19bf47ddca5723))

## 0.24.0 (2025-01-21)

Full Changelog: [v0.23.1...v0.24.0](https://github.com/orbcorp/orb-java/compare/v0.23.1...v0.24.0)

### Features

* **api:** api update ([#211](https://github.com/orbcorp/orb-java/issues/211)) ([b543b72](https://github.com/orbcorp/orb-java/commit/b543b72b81d84461d748c99fb2e450877e382d4b))

## 0.23.1 (2025-01-20)

Full Changelog: [v0.23.0...v0.23.1](https://github.com/orbcorp/orb-java/compare/v0.23.0...v0.23.1)

### Bug Fixes

* **client:** make service impl constructors internal ([#208](https://github.com/orbcorp/orb-java/issues/208)) ([50db282](https://github.com/orbcorp/orb-java/commit/50db282d60416892f293c80c9e5c0e34187f2a8c))

## 0.23.0 (2025-01-18)

Full Changelog: [v0.22.0...v0.23.0](https://github.com/orbcorp/orb-java/compare/v0.22.0...v0.23.0)

### Features

* **api:** api update ([#206](https://github.com/orbcorp/orb-java/issues/206)) ([e2eef46](https://github.com/orbcorp/orb-java/commit/e2eef4669606db8745234da24a04814da1118f86))


### Chores

* **internal:** upgrade kotlin compiler and gradle ([#203](https://github.com/orbcorp/orb-java/issues/203)) ([3e03f2b](https://github.com/orbcorp/orb-java/commit/3e03f2bb7a247262f89871ecec0a957ee50b64f4))


### Documentation

* add more documentation ([#205](https://github.com/orbcorp/orb-java/issues/205)) ([c8fbcb6](https://github.com/orbcorp/orb-java/commit/c8fbcb675e81cf8683c92843fffdbe7b4aa6286f))

## 0.22.0 (2025-01-16)

Full Changelog: [v0.21.0...v0.22.0](https://github.com/orbcorp/orb-java/compare/v0.21.0...v0.22.0)

### Features

* **api:** api update ([#200](https://github.com/orbcorp/orb-java/issues/200)) ([ff9385c](https://github.com/orbcorp/orb-java/commit/ff9385c4d792990f4f482911b6f86e70b62b1bed))

## 0.21.0 (2025-01-15)

Full Changelog: [v0.20.0...v0.21.0](https://github.com/orbcorp/orb-java/compare/v0.20.0...v0.21.0)

### Features

* **api:** api update ([#198](https://github.com/orbcorp/orb-java/issues/198)) ([5c3b405](https://github.com/orbcorp/orb-java/commit/5c3b4056210b7767bfb459a8aeebb89868ca94ed))
* **client:** add more builder convenience methods for lists ([#188](https://github.com/orbcorp/orb-java/issues/188)) ([2cc7b59](https://github.com/orbcorp/orb-java/commit/2cc7b59eef370132838b0a1c5035b54235e071e8))


### Chores

* **internal:** add and tweak check functions ([#195](https://github.com/orbcorp/orb-java/issues/195)) ([059140b](https://github.com/orbcorp/orb-java/commit/059140b58e537e077a1fdac7147b69f6a2287d3c))
* **internal:** codegen related update ([#186](https://github.com/orbcorp/orb-java/issues/186)) ([80ba077](https://github.com/orbcorp/orb-java/commit/80ba077b082aa2e8293b1389f3a24a6acf8f2d16))
* **internal:** codegen related update ([#189](https://github.com/orbcorp/orb-java/issues/189)) ([02ac7e7](https://github.com/orbcorp/orb-java/commit/02ac7e7f881d9474582f8c7a4e7ac6da9c08c24e))
* **internal:** extract a `checkRequired` function ([#194](https://github.com/orbcorp/orb-java/issues/194)) ([4d7ef18](https://github.com/orbcorp/orb-java/commit/4d7ef182abe288e73d704d490baea3129739aea9))
* **internal:** fix up root `build.gradle.kts` formatting ([#190](https://github.com/orbcorp/orb-java/issues/190)) ([c6877ff](https://github.com/orbcorp/orb-java/commit/c6877ff9cbf213990d401994bf09c11c40abfe48))
* **internal:** remove unused Gradle imports ([#191](https://github.com/orbcorp/orb-java/issues/191)) ([dc9baca](https://github.com/orbcorp/orb-java/commit/dc9bacac05d8cae6d70faee128ca9a2425a30275))
* **internal:** remove unused or unnecessary Gradle imports ([#192](https://github.com/orbcorp/orb-java/issues/192)) ([1d55476](https://github.com/orbcorp/orb-java/commit/1d55476c9984ae3c0b8bc3160c40466e04e96fad))
* **internal:** tweak client options nullability handling ([059140b](https://github.com/orbcorp/orb-java/commit/059140b58e537e077a1fdac7147b69f6a2287d3c))
* **internal:** update some gradle formatting ([#193](https://github.com/orbcorp/orb-java/issues/193)) ([84dffdc](https://github.com/orbcorp/orb-java/commit/84dffdce3a40890a70e8d486bc92efe7d7d40e7f))
* simplify examples involving lists ([#196](https://github.com/orbcorp/orb-java/issues/196)) ([087813e](https://github.com/orbcorp/orb-java/commit/087813e8217eaea12439a2b8c6df46ba32ea4d1d))
* simplify examples involving unions ([#197](https://github.com/orbcorp/orb-java/issues/197)) ([6f4b238](https://github.com/orbcorp/orb-java/commit/6f4b23885505fb6cd3cc8e94c3a405c01e7336f6))

## 0.20.0 (2025-01-07)

Full Changelog: [v0.19.0...v0.20.0](https://github.com/orbcorp/orb-java/compare/v0.19.0...v0.20.0)

### Features

* **client:** add various convenience setters to models ([#184](https://github.com/orbcorp/orb-java/issues/184)) ([5a7e67f](https://github.com/orbcorp/orb-java/commit/5a7e67f4aff5cd005c04148c72c4f9dbb1f65449))
* **client:** allow setting arbitrary JSON for top-level body params ([5a7e67f](https://github.com/orbcorp/orb-java/commit/5a7e67f4aff5cd005c04148c72c4f9dbb1f65449))
* **client:** expose getters for `JsonField` of body params ([5a7e67f](https://github.com/orbcorp/orb-java/commit/5a7e67f4aff5cd005c04148c72c4f9dbb1f65449))


### Bug Fixes

* **client:** consistently throw on omitting required fields ([5a7e67f](https://github.com/orbcorp/orb-java/commit/5a7e67f4aff5cd005c04148c72c4f9dbb1f65449))
* **client:** convert `JsonField` containing list type to mutable in builder ([5a7e67f](https://github.com/orbcorp/orb-java/commit/5a7e67f4aff5cd005c04148c72c4f9dbb1f65449))


### Documentation

* add params class javadocs ([#182](https://github.com/orbcorp/orb-java/issues/182)) ([e98658d](https://github.com/orbcorp/orb-java/commit/e98658d54e9ef45334ae98fe2901a2db1574a900))


### Styles

* **internal:** explicitly add some method return types ([5a7e67f](https://github.com/orbcorp/orb-java/commit/5a7e67f4aff5cd005c04148c72c4f9dbb1f65449))
* **internal:** move headers and query params setters below others ([5a7e67f](https://github.com/orbcorp/orb-java/commit/5a7e67f4aff5cd005c04148c72c4f9dbb1f65449))
* **internal:** simplify existing convenience setters on params ([5a7e67f](https://github.com/orbcorp/orb-java/commit/5a7e67f4aff5cd005c04148c72c4f9dbb1f65449))

## 0.19.0 (2025-01-06)

Full Changelog: [v0.18.0...v0.19.0](https://github.com/orbcorp/orb-java/compare/v0.18.0...v0.19.0)

### Features

* **api:** api update ([#180](https://github.com/orbcorp/orb-java/issues/180)) ([4aa16b5](https://github.com/orbcorp/orb-java/commit/4aa16b536e853fd276832e491ad9b9ad94b42cf1))
* **client:** allow passing null or optional for nullable fields ([#179](https://github.com/orbcorp/orb-java/issues/179)) ([1797a16](https://github.com/orbcorp/orb-java/commit/1797a16f486fefa201684321d07897d5b5b0937e))


### Styles

* **internal:** sort fields ([#177](https://github.com/orbcorp/orb-java/issues/177)) ([3313c08](https://github.com/orbcorp/orb-java/commit/3313c085e6c200cae6212b783d92ae731cbc786d))

## 0.18.0 (2025-01-06)

Full Changelog: [v0.17.0...v0.18.0](https://github.com/orbcorp/orb-java/compare/v0.17.0...v0.18.0)

### Features

* **api:** api update ([#174](https://github.com/orbcorp/orb-java/issues/174)) ([61c6949](https://github.com/orbcorp/orb-java/commit/61c6949cf074b8467e46af430f4c60636a147bc0))

## 0.17.0 (2025-01-03)

Full Changelog: [v0.16.0...v0.17.0](https://github.com/orbcorp/orb-java/compare/v0.16.0...v0.17.0)

### Features

* **api:** api update ([#172](https://github.com/orbcorp/orb-java/issues/172)) ([a14305b](https://github.com/orbcorp/orb-java/commit/a14305b29e0dbb7050689d7ce179d952c1c4fcf0))


### Documentation

* add some missing javadocs ([#170](https://github.com/orbcorp/orb-java/issues/170)) ([220eebc](https://github.com/orbcorp/orb-java/commit/220eebc9d36d1a880fb9f37485a937c53511b593))

## 0.16.0 (2025-01-03)

Full Changelog: [v0.15.0...v0.16.0](https://github.com/orbcorp/orb-java/compare/v0.15.0...v0.16.0)

### ⚠ BREAKING CHANGES

* **api:** endpoint expects amount of new allocation price to be a string, not a number ([#10](https://github.com/orbcorp/orb-java/issues/10))
* **api:** add semi_annual cadence and remove metadata from update items ([#2](https://github.com/orbcorp/orb-java/issues/2))

### Features

* **api:** add semi_annual cadence and remove metadata from update items ([#2](https://github.com/orbcorp/orb-java/issues/2)) ([38298ff](https://github.com/orbcorp/orb-java/commit/38298fffb277246750d838f4f705d3ad1a9237f8))
* **api:** add support for adding allocation price to subscription ([#8](https://github.com/orbcorp/orb-java/issues/8)) ([d150c33](https://github.com/orbcorp/orb-java/commit/d150c33743c505658aeb09b639ea4b739ad4322c))
* **api:** add support for query param include_all_blocks ([#11](https://github.com/orbcorp/orb-java/issues/11)) ([73d5e94](https://github.com/orbcorp/orb-java/commit/73d5e9453745dda4c138bed77c3dc71b306f37f3))
* **api:** add webhook validation and parsing ([#111](https://github.com/orbcorp/orb-java/issues/111)) ([4472875](https://github.com/orbcorp/orb-java/commit/44728754a99a0f06db78e6dffc215da599886913))
* **api:** api update ([#103](https://github.com/orbcorp/orb-java/issues/103)) ([aeb1fed](https://github.com/orbcorp/orb-java/commit/aeb1fed100a2ec3ab167b802d005238839ce16dd))
* **api:** api update ([#112](https://github.com/orbcorp/orb-java/issues/112)) ([aedd2bf](https://github.com/orbcorp/orb-java/commit/aedd2bf4a7266560d9b1ee1f372bb4490ac22021))
* **api:** api update ([#125](https://github.com/orbcorp/orb-java/issues/125)) ([e74b0c3](https://github.com/orbcorp/orb-java/commit/e74b0c31d3d11a4423fc6e7d4e33bbe764a80e8c))
* **api:** api update ([#129](https://github.com/orbcorp/orb-java/issues/129)) ([e8edbd0](https://github.com/orbcorp/orb-java/commit/e8edbd02e37c71b4f3efdecd13996e6bcb9a1f1e))
* **api:** api update ([#131](https://github.com/orbcorp/orb-java/issues/131)) ([1733a5c](https://github.com/orbcorp/orb-java/commit/1733a5cdb272627dc19f53269cf11953dc00e37b))
* **api:** api update ([#137](https://github.com/orbcorp/orb-java/issues/137)) ([60695f9](https://github.com/orbcorp/orb-java/commit/60695f967b5c91f7ebeaa2c36bd5fddc5914a2ea))
* **api:** api update ([#140](https://github.com/orbcorp/orb-java/issues/140)) ([6a3362e](https://github.com/orbcorp/orb-java/commit/6a3362e8fa8181f732195e8391bf6e39329f23ec))
* **api:** api update ([#152](https://github.com/orbcorp/orb-java/issues/152)) ([7a78319](https://github.com/orbcorp/orb-java/commit/7a78319428de5e34858e6d9e73c5b4b21da4b2ad))
* **api:** api update ([#154](https://github.com/orbcorp/orb-java/issues/154)) ([770d4cc](https://github.com/orbcorp/orb-java/commit/770d4cc165b3d6952efd593141759c3b59a1f1b9))
* **api:** api update ([#159](https://github.com/orbcorp/orb-java/issues/159)) ([f51bb21](https://github.com/orbcorp/orb-java/commit/f51bb21f026a27c10107516546fe079192e5c5ee))
* **api:** api update ([#161](https://github.com/orbcorp/orb-java/issues/161)) ([6b21c9b](https://github.com/orbcorp/orb-java/commit/6b21c9bccc2baf99fe45c25e62253db9b543381e))
* **api:** api update ([#81](https://github.com/orbcorp/orb-java/issues/81)) ([6b595ca](https://github.com/orbcorp/orb-java/commit/6b595caf0ced6da64742883efae7ff55aa3a74b6))
* **api:** api update ([#82](https://github.com/orbcorp/orb-java/issues/82)) ([3d2aa72](https://github.com/orbcorp/orb-java/commit/3d2aa72926de34616e5c622197204f32c48462bf))
* **api:** api update ([#84](https://github.com/orbcorp/orb-java/issues/84)) ([89db90d](https://github.com/orbcorp/orb-java/commit/89db90d6b9ca93f3469b8095f193e943e2580c83))
* **api:** api update ([#85](https://github.com/orbcorp/orb-java/issues/85)) ([ccb4f21](https://github.com/orbcorp/orb-java/commit/ccb4f21cabdd7a8db4a57fe7a8de1570ce4a1863))
* **api:** api update ([#86](https://github.com/orbcorp/orb-java/issues/86)) ([4f4639d](https://github.com/orbcorp/orb-java/commit/4f4639dbf70bbb75f56e96fc574441a37518656e))
* **api:** api update ([#87](https://github.com/orbcorp/orb-java/issues/87)) ([925563d](https://github.com/orbcorp/orb-java/commit/925563d00a38d6f78a56413aa8a24cf61fc41805))
* **api:** api update ([#88](https://github.com/orbcorp/orb-java/issues/88)) ([8a09a17](https://github.com/orbcorp/orb-java/commit/8a09a173eec143cc8f574c4623985b69246bc8fe))
* **api:** api update ([#90](https://github.com/orbcorp/orb-java/issues/90)) ([6a7b7b8](https://github.com/orbcorp/orb-java/commit/6a7b7b8e059d6d1257d0e256818f01f5778a4636))
* **api:** api update ([#92](https://github.com/orbcorp/orb-java/issues/92)) ([b06d37a](https://github.com/orbcorp/orb-java/commit/b06d37a55e7746a5058750036acf5e7ff888f866))
* **api:** api update ([#93](https://github.com/orbcorp/orb-java/issues/93)) ([311c123](https://github.com/orbcorp/orb-java/commit/311c123cd870144fcbda844e1d9dbc0843fc320e))
* **api:** api update ([#94](https://github.com/orbcorp/orb-java/issues/94)) ([1ab1485](https://github.com/orbcorp/orb-java/commit/1ab148544455697718f423e1bde89f39669b53ae))
* **api:** api update ([#97](https://github.com/orbcorp/orb-java/issues/97)) ([d85ab62](https://github.com/orbcorp/orb-java/commit/d85ab623e23c592afc053ad6ade1aec9c7e07de9))
* **api:** codegen changes ([#39](https://github.com/orbcorp/orb-java/issues/39)) ([4568489](https://github.com/orbcorp/orb-java/commit/4568489793e5a8793a8ebe847efa218cdaa494e5))
* **api:** codegen changes ([#48](https://github.com/orbcorp/orb-java/issues/48)) ([8a0190e](https://github.com/orbcorp/orb-java/commit/8a0190e72457485174719ab58948dc474d53ca25))
* **api:** external connections made optional when updating items ([#9](https://github.com/orbcorp/orb-java/issues/9)) ([d1a63a3](https://github.com/orbcorp/orb-java/commit/d1a63a3edcd71535e421b9ded0f749e96d18b253))
* **api:** manual updates ([#40](https://github.com/orbcorp/orb-java/issues/40)) ([423de9f](https://github.com/orbcorp/orb-java/commit/423de9f49600ef8deac5049da1f96956fddcf69f))
* **api:** OpenAPI spec update via Stainless API ([#31](https://github.com/orbcorp/orb-java/issues/31)) ([aec4e89](https://github.com/orbcorp/orb-java/commit/aec4e89c811c7704b68ca6acbe2c81f1f2dbfd8c))
* **api:** OpenAPI spec update via Stainless API ([#34](https://github.com/orbcorp/orb-java/issues/34)) ([3a42785](https://github.com/orbcorp/orb-java/commit/3a427852b444a502116457fb1d45ff85e9378cd5))
* **api:** OpenAPI spec update via Stainless API ([#36](https://github.com/orbcorp/orb-java/issues/36)) ([03178df](https://github.com/orbcorp/orb-java/commit/03178dfaa6bfd6a3b180438916cb44738bb084d4))
* **api:** OpenAPI spec update via Stainless API ([#37](https://github.com/orbcorp/orb-java/issues/37)) ([6d07d56](https://github.com/orbcorp/orb-java/commit/6d07d56a02f520af24180d9e825b9551c8d4bf7a))
* **api:** OpenAPI spec update via Stainless API ([#38](https://github.com/orbcorp/orb-java/issues/38)) ([a92d627](https://github.com/orbcorp/orb-java/commit/a92d627184db41c58d90bf860e1746276a4228fb))
* **api:** OpenAPI spec update via Stainless API ([#41](https://github.com/orbcorp/orb-java/issues/41)) ([64fdca5](https://github.com/orbcorp/orb-java/commit/64fdca5952f67afccb6220c99bc39a6417bb8ba2))
* **api:** OpenAPI spec update via Stainless API ([#43](https://github.com/orbcorp/orb-java/issues/43)) ([ed5e3c8](https://github.com/orbcorp/orb-java/commit/ed5e3c8cafa1abfee247ddbe824700084ef7d7a7))
* **api:** OpenAPI spec update via Stainless API ([#44](https://github.com/orbcorp/orb-java/issues/44)) ([9941471](https://github.com/orbcorp/orb-java/commit/994147155249ff02075d5c590671654cbcbb6676))
* **api:** OpenAPI spec update via Stainless API ([#45](https://github.com/orbcorp/orb-java/issues/45)) ([055d0a8](https://github.com/orbcorp/orb-java/commit/055d0a81db48729e99980b83ac275338d6aa1e7b))
* **api:** OpenAPI spec update via Stainless API ([#47](https://github.com/orbcorp/orb-java/issues/47)) ([cbb6cca](https://github.com/orbcorp/orb-java/commit/cbb6cca7e31e1c44ae3b00811fb5979e2912d5e8))
* **api:** OpenAPI spec update via Stainless API ([#50](https://github.com/orbcorp/orb-java/issues/50)) ([2bd0af6](https://github.com/orbcorp/orb-java/commit/2bd0af6f644d5f0273003f22af55c4116ea325a0))
* **api:** OpenAPI spec update via Stainless API ([#51](https://github.com/orbcorp/orb-java/issues/51)) ([c4e232e](https://github.com/orbcorp/orb-java/commit/c4e232ed8a840f5f0da7618f489fa3c24d9c5af4))
* **api:** OpenAPI spec update via Stainless API ([#52](https://github.com/orbcorp/orb-java/issues/52)) ([773d7e7](https://github.com/orbcorp/orb-java/commit/773d7e71970a4629fbfd32c92ebfd1c8288c3327))
* **api:** OpenAPI spec update via Stainless API ([#53](https://github.com/orbcorp/orb-java/issues/53)) ([7efa5f4](https://github.com/orbcorp/orb-java/commit/7efa5f4042e763b642d99e3b41dcf5350ceb97b8))
* **api:** OpenAPI spec update via Stainless API ([#54](https://github.com/orbcorp/orb-java/issues/54)) ([f9006eb](https://github.com/orbcorp/orb-java/commit/f9006ebdc60bb00a77a7d574c82601b32f86ac4c))
* **api:** OpenAPI spec update via Stainless API ([#55](https://github.com/orbcorp/orb-java/issues/55)) ([73ed069](https://github.com/orbcorp/orb-java/commit/73ed069286d3e6e23081f31bcae1c4739f3ef5c3))
* **api:** OpenAPI spec update via Stainless API ([#57](https://github.com/orbcorp/orb-java/issues/57)) ([4a3ce75](https://github.com/orbcorp/orb-java/commit/4a3ce752daa3fc63a858b3f94c033b5e2bde0288))
* **api:** OpenAPI spec update via Stainless API ([#59](https://github.com/orbcorp/orb-java/issues/59)) ([8e8574c](https://github.com/orbcorp/orb-java/commit/8e8574cb159e45ab036088048a1362a6a8c32cc2))
* **api:** OpenAPI spec update via Stainless API ([#61](https://github.com/orbcorp/orb-java/issues/61)) ([b48f9fe](https://github.com/orbcorp/orb-java/commit/b48f9fe87aae83b2bb028a4c8216a66f26af8801))
* **api:** OpenAPI spec update via Stainless API ([#63](https://github.com/orbcorp/orb-java/issues/63)) ([fd13223](https://github.com/orbcorp/orb-java/commit/fd13223cd190ecee0312f5d64d74522db567d864))
* **api:** OpenAPI spec update via Stainless API ([#67](https://github.com/orbcorp/orb-java/issues/67)) ([afffd96](https://github.com/orbcorp/orb-java/commit/afffd968e135d74d899c0377b0f6e5bf1787ae33))
* **api:** OpenAPI spec update via Stainless API ([#68](https://github.com/orbcorp/orb-java/issues/68)) ([bd66065](https://github.com/orbcorp/orb-java/commit/bd6606510bf4dad9be78d019b9130542d0a9a532))
* **api:** OpenAPI spec update via Stainless API ([#70](https://github.com/orbcorp/orb-java/issues/70)) ([8ab0aab](https://github.com/orbcorp/orb-java/commit/8ab0aab0ebea8a4d147a9c93b0e30917192743a6))
* **api:** OpenAPI spec update via Stainless API ([#76](https://github.com/orbcorp/orb-java/issues/76)) ([5013205](https://github.com/orbcorp/orb-java/commit/50132057be8af15e443e6c6ee6a3828d24b888c0))
* **api:** OpenAPI spec update via Stainless API ([#78](https://github.com/orbcorp/orb-java/issues/78)) ([e745d41](https://github.com/orbcorp/orb-java/commit/e745d410327507e514b35968c97b29c7983b90df))
* **api:** OpenAPI spec update via Stainless API ([#80](https://github.com/orbcorp/orb-java/issues/80)) ([e1fc9e9](https://github.com/orbcorp/orb-java/commit/e1fc9e9f9b9f38313e051194e430880cfa46dad4))
* **api:** updates ([#5](https://github.com/orbcorp/orb-java/issues/5)) ([fb8c7d9](https://github.com/orbcorp/orb-java/commit/fb8c7d974e51d260d1bb9aa1f93021a64288589a))
* **client:** add logging when debug env is set ([#124](https://github.com/orbcorp/orb-java/issues/124)) ([3a54438](https://github.com/orbcorp/orb-java/commit/3a5443850294502d15401f96a0e7680dbd60275d))
* **client:** add support for `putQueryParam` on `ClientOptions` ([#6](https://github.com/orbcorp/orb-java/issues/6)) ([71d82b0](https://github.com/orbcorp/orb-java/commit/71d82b0545a51df2abb8ebfe852991d9f740d498))
* **client:** added structured fields to errors ([#65](https://github.com/orbcorp/orb-java/issues/65)) ([e6226f9](https://github.com/orbcorp/orb-java/commit/e6226f9a57e42c1786353757aca5b32744a24ffb))


### Bug Fixes

* **api:** endpoint expects amount of new allocation price to be a string, not a number ([#10](https://github.com/orbcorp/orb-java/issues/10)) ([f38419a](https://github.com/orbcorp/orb-java/commit/f38419a6c6b10b5137d573dfc9c7f5a96a302348))
* **docs:** use correct putAdditionalProperty value ([#42](https://github.com/orbcorp/orb-java/issues/42)) ([4f236bc](https://github.com/orbcorp/orb-java/commit/4f236bc7d29a65895aafd0c9c5e6e1745fb42bad))
* **internal:** add missing options ([49c0367](https://github.com/orbcorp/orb-java/commit/49c03672bca758f032e5125099c0e5bcf415f770))
* **unions:** fix namespacing in example types for unions that have models ([846d155](https://github.com/orbcorp/orb-java/commit/846d15562417ca933515297623d630db0ec9e9a0))


### Chores

* **api:** rename `void` to `void_invoice` in Java SDK ([#72](https://github.com/orbcorp/orb-java/issues/72)) ([61d300a](https://github.com/orbcorp/orb-java/commit/61d300a474bca6fc47658bb3daa9dc7f1de44a16))
* consistent string literal escaping ([#49](https://github.com/orbcorp/orb-java/issues/49)) ([556e69d](https://github.com/orbcorp/orb-java/commit/556e69d08db6005e58612fc83828329c9beb608c))
* **docs:** improve Coupon description ([#7](https://github.com/orbcorp/orb-java/issues/7)) ([4d1d183](https://github.com/orbcorp/orb-java/commit/4d1d183eba7883c30007edc2aac0ab27c5e62600))
* **docs:** internal update ([#74](https://github.com/orbcorp/orb-java/issues/74)) ([577588d](https://github.com/orbcorp/orb-java/commit/577588daa262f51547de5eb6785226fdca41be2b))
* **docs:** internal update ([#75](https://github.com/orbcorp/orb-java/issues/75)) ([6905912](https://github.com/orbcorp/orb-java/commit/69059129d10672b1806b2288e044ff986c53d0c8))
* **docs:** update readme ([#157](https://github.com/orbcorp/orb-java/issues/157)) ([26c33ec](https://github.com/orbcorp/orb-java/commit/26c33ecb791a128a35e3132359f3265a2e0f89cb))
* **docs:** updates price intervals docs ([#12](https://github.com/orbcorp/orb-java/issues/12)) ([554df1b](https://github.com/orbcorp/orb-java/commit/554df1b92b83237d8f88cea66bee47524ee8d9db))
* fix formatting ([6d27c6c](https://github.com/orbcorp/orb-java/commit/6d27c6c9e5047097764aa79cf7cbd00106ad8039))
* gitignore test server logs ([#13](https://github.com/orbcorp/orb-java/issues/13)) ([11e4ebc](https://github.com/orbcorp/orb-java/commit/11e4ebc52501ab8c6ea3ba15eff0ef82134eda89))
* **internal:** codegen related update ([#123](https://github.com/orbcorp/orb-java/issues/123)) ([9bbb41f](https://github.com/orbcorp/orb-java/commit/9bbb41f1fca7dfddc6ed2ecd1493c99183405cc5))
* **internal:** codegen related update ([#134](https://github.com/orbcorp/orb-java/issues/134)) ([61e2a3f](https://github.com/orbcorp/orb-java/commit/61e2a3f250034b37c31697cda1f9366445d88358))
* **internal:** codegen related update ([#163](https://github.com/orbcorp/orb-java/issues/163)) ([9361feb](https://github.com/orbcorp/orb-java/commit/9361febeaacb3ccaa005071ec9e7cf1a07037566))
* **internal:** codegen related update ([#164](https://github.com/orbcorp/orb-java/issues/164)) ([d2a3612](https://github.com/orbcorp/orb-java/commit/d2a3612a46c69917fce2ac6a9ba0d8bda398d5d8))
* **internal:** codegen related update ([#167](https://github.com/orbcorp/orb-java/issues/167)) ([5064c6d](https://github.com/orbcorp/orb-java/commit/5064c6d8c3faec116445162be14797b14e3adf60))
* **internal:** codegen related update ([#56](https://github.com/orbcorp/orb-java/issues/56)) ([837e1ed](https://github.com/orbcorp/orb-java/commit/837e1ed1619d993c680581d3dc6a9e02e1c9f8a6))
* **internal:** codegen related update ([#71](https://github.com/orbcorp/orb-java/issues/71)) ([99ddc03](https://github.com/orbcorp/orb-java/commit/99ddc031f02c7fe5648bfad4b6de0481864707cc))
* **internal:** codegen related update ([#73](https://github.com/orbcorp/orb-java/issues/73)) ([5021325](https://github.com/orbcorp/orb-java/commit/50213258784197ba307bfe34f7c82a8ee821439a))
* **internal:** fix lint warning for isPresent ([#66](https://github.com/orbcorp/orb-java/issues/66)) ([ff81eb6](https://github.com/orbcorp/orb-java/commit/ff81eb6ab227a308b45b0fa961ce3a8759826fdf))
* **internal:** remove unused and expand used wildcard imports ([#150](https://github.com/orbcorp/orb-java/issues/150)) ([f2ff940](https://github.com/orbcorp/orb-java/commit/f2ff940f47f5d584cff2d737e02a048b01dc07f3))
* **internal:** remove unused and expand used wildcard imports ([#151](https://github.com/orbcorp/orb-java/issues/151)) ([36ec9ab](https://github.com/orbcorp/orb-java/commit/36ec9ab1cb60ab066483d92e64df3bbb4cfe1103))
* **internal:** remove unused imports ([#147](https://github.com/orbcorp/orb-java/issues/147)) ([fb322e7](https://github.com/orbcorp/orb-java/commit/fb322e7077af79c5e7ce7eb7f87bda7e2723df26))
* **internal:** update example values ([#127](https://github.com/orbcorp/orb-java/issues/127)) ([78608a6](https://github.com/orbcorp/orb-java/commit/78608a6180b01aa0499a9754eff16064d260f4d5))
* **internal:** version bump ([#100](https://github.com/orbcorp/orb-java/issues/100)) ([3993648](https://github.com/orbcorp/orb-java/commit/39936484979235feef711bfde8f3e2333df69d7b))
* **internal:** version bump ([#109](https://github.com/orbcorp/orb-java/issues/109)) ([0a4c949](https://github.com/orbcorp/orb-java/commit/0a4c94986ef02371572b282ebd79c0f0d8a8a0b0))
* **internal:** version bump ([#119](https://github.com/orbcorp/orb-java/issues/119)) ([793a5e4](https://github.com/orbcorp/orb-java/commit/793a5e4c812ce6eadba334e9a084026c8b10d68d))
* **internal:** version bump ([#121](https://github.com/orbcorp/orb-java/issues/121)) ([8b54a94](https://github.com/orbcorp/orb-java/commit/8b54a9444164d3577705770cd35e1e0806b0f926))
* **internal:** version bump ([#122](https://github.com/orbcorp/orb-java/issues/122)) ([ed488d2](https://github.com/orbcorp/orb-java/commit/ed488d23958a93d2f606c49307eb5a5abdfdc31d))
* **internal:** version bump ([#89](https://github.com/orbcorp/orb-java/issues/89)) ([14ae070](https://github.com/orbcorp/orb-java/commit/14ae070250523c21dd90a82cbd70685694bbbb87))
* rebuild project due to codegen change ([#105](https://github.com/orbcorp/orb-java/issues/105)) ([686edce](https://github.com/orbcorp/orb-java/commit/686edce1218e41f4c48735dfe563601c1b354426))
* rebuild project due to codegen change ([#107](https://github.com/orbcorp/orb-java/issues/107)) ([15f22cd](https://github.com/orbcorp/orb-java/commit/15f22cdf943dd29bfcd710ef410c92bd33fa237b))
* rebuild project due to codegen change ([#116](https://github.com/orbcorp/orb-java/issues/116)) ([94d7006](https://github.com/orbcorp/orb-java/commit/94d700697d44adede203c1f7d3dda1e67f37eae2))
* **test:** remove unused imports ([#148](https://github.com/orbcorp/orb-java/issues/148)) ([6f766e5](https://github.com/orbcorp/orb-java/commit/6f766e534aca6263f04c28321904493f3d02cc1b))
* **test:** use `JsonValue` instead of `JsonString` ([#149](https://github.com/orbcorp/orb-java/issues/149)) ([119422b](https://github.com/orbcorp/orb-java/commit/119422b8ded3064bf6dd2566b9cfabac0087068c))
* update example values in tests and docs ([#143](https://github.com/orbcorp/orb-java/issues/143)) ([28f1ab5](https://github.com/orbcorp/orb-java/commit/28f1ab5198e58c2b1e26045d8b81b1504cdd45cb))


### Documentation

* adjust additional properties example ([#64](https://github.com/orbcorp/orb-java/issues/64)) ([f200314](https://github.com/orbcorp/orb-java/commit/f20031470e553f4e414375e536e1366c2316dfb2))
* small updates ([#3](https://github.com/orbcorp/orb-java/issues/3)) ([11b888b](https://github.com/orbcorp/orb-java/commit/11b888b44a0063a15bb0bdee64273659b9cc4514))


### Styles

* **internal:** make enum value definitions less verbose ([#145](https://github.com/orbcorp/orb-java/issues/145)) ([1a3bc07](https://github.com/orbcorp/orb-java/commit/1a3bc075994b287ce658648895c18cf4c8586db0))
* **internal:** move enum identity methods to bottom of class ([#146](https://github.com/orbcorp/orb-java/issues/146)) ([c2bc9d2](https://github.com/orbcorp/orb-java/commit/c2bc9d251f3dc3eb887467570c68f0335d4a61b1))

## 0.15.0 (2025-01-02)

Full Changelog: [v0.14.0...v0.15.0](https://github.com/orbcorp/orb-java/compare/v0.14.0...v0.15.0)

### Features

* **api:** api update ([#161](https://github.com/orbcorp/orb-java/issues/161)) ([d035cba](https://github.com/orbcorp/orb-java/commit/d035cbaf1d1d98117ed800b746e969b1c6b368cc))

## 0.14.0 (2024-12-23)

Full Changelog: [v0.13.0...v0.14.0](https://github.com/orbcorp/orb-java/compare/v0.13.0...v0.14.0)

### Features

* **api:** api update ([#159](https://github.com/orbcorp/orb-java/issues/159)) ([8b90db2](https://github.com/orbcorp/orb-java/commit/8b90db21c09850fa322e51d9e0586caac3d5476d))


### Chores

* **docs:** update readme ([#157](https://github.com/orbcorp/orb-java/issues/157)) ([4c11716](https://github.com/orbcorp/orb-java/commit/4c1171658c630869fcf256ed76244d8a626a9d16))

## 0.13.0 (2024-12-17)

Full Changelog: [v0.12.0...v0.13.0](https://github.com/orbcorp/orb-java/compare/v0.12.0...v0.13.0)

### Features

* **api:** api update ([#154](https://github.com/orbcorp/orb-java/issues/154)) ([64ef61a](https://github.com/orbcorp/orb-java/commit/64ef61a220e534f5991bfcb156a4465971d60158))

## 0.12.0 (2024-12-12)

Full Changelog: [v0.11.0...v0.12.0](https://github.com/orbcorp/orb-java/compare/v0.11.0...v0.12.0)

### Features

* **api:** api update ([#152](https://github.com/orbcorp/orb-java/issues/152)) ([80e4392](https://github.com/orbcorp/orb-java/commit/80e4392479ef269e8c2c4fe785fdd4e365ce63fb))


### Chores

* **internal:** remove unused and expand used wildcard imports ([#150](https://github.com/orbcorp/orb-java/issues/150)) ([125239d](https://github.com/orbcorp/orb-java/commit/125239d512c263421213eeb779a114dcaae25032))
* **internal:** remove unused and expand used wildcard imports ([#151](https://github.com/orbcorp/orb-java/issues/151)) ([e31d1ed](https://github.com/orbcorp/orb-java/commit/e31d1ed415f6f2f3eecd33bb198d1b93cd59c4fb))
* **internal:** remove unused imports ([#147](https://github.com/orbcorp/orb-java/issues/147)) ([fbafbb5](https://github.com/orbcorp/orb-java/commit/fbafbb58161b70959c6ac9a3e484478571633619))
* **test:** remove unused imports ([#148](https://github.com/orbcorp/orb-java/issues/148)) ([b170c90](https://github.com/orbcorp/orb-java/commit/b170c90db37d08d16ea65b4e9650c6281dc65124))
* **test:** use `JsonValue` instead of `JsonString` ([#149](https://github.com/orbcorp/orb-java/issues/149)) ([b177193](https://github.com/orbcorp/orb-java/commit/b177193c824bb6c6a3e80e1c6248b5f87b51be90))
* update example values in tests and docs ([#143](https://github.com/orbcorp/orb-java/issues/143)) ([3ae9d16](https://github.com/orbcorp/orb-java/commit/3ae9d16e54069c512ca6afcc912ebd4522428d92))


### Styles

* **internal:** make enum value definitions less verbose ([#145](https://github.com/orbcorp/orb-java/issues/145)) ([618c1a3](https://github.com/orbcorp/orb-java/commit/618c1a3ccf88c313d9fff21ee49520f638cd49d2))
* **internal:** move enum identity methods to bottom of class ([#146](https://github.com/orbcorp/orb-java/issues/146)) ([8a9c393](https://github.com/orbcorp/orb-java/commit/8a9c3931e848d900c5d915329919e5a7f1164d08))

## 0.11.0 (2024-12-03)

Full Changelog: [v0.10.0...v0.11.0](https://github.com/orbcorp/orb-java/compare/v0.10.0...v0.11.0)

### Features

* **api:** api update ([#140](https://github.com/orbcorp/orb-java/issues/140)) ([0ee4496](https://github.com/orbcorp/orb-java/commit/0ee449687d7314aa4f6c128d2f39c4a86fee1dd0))

## 0.10.0 (2024-11-27)

Full Changelog: [v0.9.1...v0.10.0](https://github.com/orbcorp/orb-java/compare/v0.9.1...v0.10.0)

### Features

* **api:** api update ([#137](https://github.com/orbcorp/orb-java/issues/137)) ([b27eaf1](https://github.com/orbcorp/orb-java/commit/b27eaf170e3ec24153a7e797075fe3d25d427d54))

## 0.9.1 (2024-11-26)

Full Changelog: [v0.9.0...v0.9.1](https://github.com/orbcorp/orb-java/compare/v0.9.0...v0.9.1)

### Chores

* **internal:** codegen related update ([#134](https://github.com/orbcorp/orb-java/issues/134)) ([61e2a3f](https://github.com/orbcorp/orb-java/commit/61e2a3f250034b37c31697cda1f9366445d88358))

## 0.9.0 (2024-11-26)

Full Changelog: [v0.8.0...v0.9.0](https://github.com/orbcorp/orb-java/compare/v0.8.0...v0.9.0)

### Features

* **api:** api update ([#131](https://github.com/orbcorp/orb-java/issues/131)) ([8ef1405](https://github.com/orbcorp/orb-java/commit/8ef140591b579e8bdec3ecdf25008b7995d5f3e0))

## 0.8.0 (2024-11-25)

Full Changelog: [v0.7.0...v0.8.0](https://github.com/orbcorp/orb-java/compare/v0.7.0...v0.8.0)

### Features

* **api:** api update ([#129](https://github.com/orbcorp/orb-java/issues/129)) ([4f1e414](https://github.com/orbcorp/orb-java/commit/4f1e4143bedf579fc5dcd17d0872ab64d23962e2))


### Chores

* **internal:** update example values ([#127](https://github.com/orbcorp/orb-java/issues/127)) ([6323bfd](https://github.com/orbcorp/orb-java/commit/6323bfda070264b781803fb7fcc29b9711cda006))

## 0.7.0 (2024-11-25)

Full Changelog: [v0.6.1...v0.7.0](https://github.com/orbcorp/orb-java/compare/v0.6.1...v0.7.0)

### Features

* **api:** api update ([#125](https://github.com/orbcorp/orb-java/issues/125)) ([4b935c7](https://github.com/orbcorp/orb-java/commit/4b935c7382677f2fe81ebd260e234751769444a9))
* **client:** add logging when debug env is set ([#124](https://github.com/orbcorp/orb-java/issues/124)) ([3000c2e](https://github.com/orbcorp/orb-java/commit/3000c2ecb971be9285631e42ae4c5871605df0a1))


### Chores

* **internal:** codegen related update ([#123](https://github.com/orbcorp/orb-java/issues/123)) ([c08609a](https://github.com/orbcorp/orb-java/commit/c08609aa223cd9cdc77f3179da506d1f35252fe5))
* **internal:** version bump ([#119](https://github.com/orbcorp/orb-java/issues/119)) ([bfcad34](https://github.com/orbcorp/orb-java/commit/bfcad34e9c6a1d3c21812c89f83c528487ab1e1b))
* **internal:** version bump ([#121](https://github.com/orbcorp/orb-java/issues/121)) ([6388030](https://github.com/orbcorp/orb-java/commit/638803028321775a8581fa525354e55503a12edd))
* **internal:** version bump ([#122](https://github.com/orbcorp/orb-java/issues/122)) ([3163e60](https://github.com/orbcorp/orb-java/commit/3163e60efb09dd43e751a32ad299688c0fa2bfe3))

## 0.6.1 (2024-11-19)

Full Changelog: [v0.6.0...v0.6.1](https://github.com/orbcorp/orb-java/compare/v0.6.0...v0.6.1)

### Chores

* rebuild project due to codegen change ([#116](https://github.com/orbcorp/orb-java/issues/116)) ([94d7006](https://github.com/orbcorp/orb-java/commit/94d700697d44adede203c1f7d3dda1e67f37eae2))

## 0.6.0 (2024-11-18)

Full Changelog: [v0.5.0...v0.6.0](https://github.com/orbcorp/orb-java/compare/v0.5.0...v0.6.0)

### Features

* **api:** add webhook validation and parsing ([#111](https://github.com/orbcorp/orb-java/issues/111)) ([993bd2b](https://github.com/orbcorp/orb-java/commit/993bd2b43a362a5b7a4ecc5dbfd6b71125f1f8eb))

## 0.5.0 (2024-11-15)

Full Changelog: [v0.4.1...v0.5.0](https://github.com/orbcorp/orb-java/compare/v0.4.1...v0.5.0)

### Features

* **api:** api update ([#112](https://github.com/orbcorp/orb-java/issues/112)) ([f3be701](https://github.com/orbcorp/orb-java/commit/f3be70102a7e6a5c08525310d329189b9f3882dc))


### Chores

* **internal:** version bump ([#109](https://github.com/orbcorp/orb-java/issues/109)) ([be27a58](https://github.com/orbcorp/orb-java/commit/be27a582d7072c33d6969aaea3dae77606eece48))

## 0.4.1 (2024-11-12)

Full Changelog: [v0.4.0...v0.4.1](https://github.com/orbcorp/orb-java/compare/v0.4.0...v0.4.1)

### Bug Fixes

* **internal:** add missing options ([1ed6c28](https://github.com/orbcorp/orb-java/commit/1ed6c28c1dacee3121ae2fad5645ea84b5486737))


### Chores

* rebuild project due to codegen change ([#105](https://github.com/orbcorp/orb-java/issues/105)) ([6c52ea7](https://github.com/orbcorp/orb-java/commit/6c52ea7a17936f5f675d51b1bcc1a3b6d4816c56))
* rebuild project due to codegen change ([#107](https://github.com/orbcorp/orb-java/issues/107)) ([0365098](https://github.com/orbcorp/orb-java/commit/0365098b47e408203b0bc2bc4d723ef2c577fe60))

## 0.4.0 (2024-11-06)

Full Changelog: [v0.3.0...v0.4.0](https://github.com/orbcorp/orb-java/compare/v0.3.0...v0.4.0)

### Features

* **api:** api update ([#103](https://github.com/orbcorp/orb-java/issues/103)) ([7f8fb9d](https://github.com/orbcorp/orb-java/commit/7f8fb9d3cbc2d0a1a131b3bf07e6a858cb1765b1))


### Chores

* **internal:** version bump ([#100](https://github.com/orbcorp/orb-java/issues/100)) ([ad65284](https://github.com/orbcorp/orb-java/commit/ad652840c239be31c15c58da11a3e11b3b23db2e))

## 0.3.0 (2024-11-06)

Full Changelog: [v0.2.0...v0.3.0](https://github.com/orbcorp/orb-java/compare/v0.2.0...v0.3.0)

### Features

* **api:** api update ([#97](https://github.com/orbcorp/orb-java/issues/97)) ([cd5ec21](https://github.com/orbcorp/orb-java/commit/cd5ec21f1f77a082c5a04f9cbd1565eccdf27882))

## 0.2.0 (2024-11-01)

Full Changelog: [v0.1.0...v0.2.0](https://github.com/orbcorp/orb-java/compare/v0.1.0...v0.2.0)

### Features

* **api:** api update ([#90](https://github.com/orbcorp/orb-java/issues/90)) ([9058993](https://github.com/orbcorp/orb-java/commit/9058993fe3a504740a1726494688780f3a3ef31b))


### Chores

* **internal:** version bump ([#89](https://github.com/orbcorp/orb-java/issues/89)) ([eae6b90](https://github.com/orbcorp/orb-java/commit/eae6b90e8a24ae823ddf08ab9cf39cc2c5d3b8e3))

## 0.1.0 (2024-10-28)

Full Changelog: [v0.1.0-alpha.7...v0.1.0](https://github.com/orbcorp/orb-java/compare/v0.1.0-alpha.7...v0.1.0)

### Features

* **api:** api update ([#81](https://github.com/orbcorp/orb-java/issues/81)) ([6b595ca](https://github.com/orbcorp/orb-java/commit/6b595caf0ced6da64742883efae7ff55aa3a74b6))
* **api:** api update ([#82](https://github.com/orbcorp/orb-java/issues/82)) ([3d2aa72](https://github.com/orbcorp/orb-java/commit/3d2aa72926de34616e5c622197204f32c48462bf))
* **api:** api update ([#84](https://github.com/orbcorp/orb-java/issues/84)) ([89db90d](https://github.com/orbcorp/orb-java/commit/89db90d6b9ca93f3469b8095f193e943e2580c83))
* **api:** api update ([#85](https://github.com/orbcorp/orb-java/issues/85)) ([ccb4f21](https://github.com/orbcorp/orb-java/commit/ccb4f21cabdd7a8db4a57fe7a8de1570ce4a1863))
* **api:** api update ([#86](https://github.com/orbcorp/orb-java/issues/86)) ([4f4639d](https://github.com/orbcorp/orb-java/commit/4f4639dbf70bbb75f56e96fc574441a37518656e))
* **api:** api update ([#87](https://github.com/orbcorp/orb-java/issues/87)) ([925563d](https://github.com/orbcorp/orb-java/commit/925563d00a38d6f78a56413aa8a24cf61fc41805))
* **api:** api update ([#88](https://github.com/orbcorp/orb-java/issues/88)) ([8a09a17](https://github.com/orbcorp/orb-java/commit/8a09a173eec143cc8f574c4623985b69246bc8fe))
* **api:** OpenAPI spec update via Stainless API ([#78](https://github.com/orbcorp/orb-java/issues/78)) ([e745d41](https://github.com/orbcorp/orb-java/commit/e745d410327507e514b35968c97b29c7983b90df))
* **api:** OpenAPI spec update via Stainless API ([#80](https://github.com/orbcorp/orb-java/issues/80)) ([e1fc9e9](https://github.com/orbcorp/orb-java/commit/e1fc9e9f9b9f38313e051194e430880cfa46dad4))

## 0.1.0-alpha.7 (2024-09-26)

Full Changelog: [v0.1.0-alpha.6...v0.1.0-alpha.7](https://github.com/orbcorp/orb-java/compare/v0.1.0-alpha.6...v0.1.0-alpha.7)

### Features

* **api:** OpenAPI spec update via Stainless API ([#59](https://github.com/orbcorp/orb-java/issues/59)) ([8e8574c](https://github.com/orbcorp/orb-java/commit/8e8574cb159e45ab036088048a1362a6a8c32cc2))
* **api:** OpenAPI spec update via Stainless API ([#61](https://github.com/orbcorp/orb-java/issues/61)) ([b48f9fe](https://github.com/orbcorp/orb-java/commit/b48f9fe87aae83b2bb028a4c8216a66f26af8801))
* **api:** OpenAPI spec update via Stainless API ([#63](https://github.com/orbcorp/orb-java/issues/63)) ([fd13223](https://github.com/orbcorp/orb-java/commit/fd13223cd190ecee0312f5d64d74522db567d864))
* **api:** OpenAPI spec update via Stainless API ([#67](https://github.com/orbcorp/orb-java/issues/67)) ([afffd96](https://github.com/orbcorp/orb-java/commit/afffd968e135d74d899c0377b0f6e5bf1787ae33))
* **api:** OpenAPI spec update via Stainless API ([#68](https://github.com/orbcorp/orb-java/issues/68)) ([bd66065](https://github.com/orbcorp/orb-java/commit/bd6606510bf4dad9be78d019b9130542d0a9a532))
* **api:** OpenAPI spec update via Stainless API ([#70](https://github.com/orbcorp/orb-java/issues/70)) ([8ab0aab](https://github.com/orbcorp/orb-java/commit/8ab0aab0ebea8a4d147a9c93b0e30917192743a6))
* **api:** OpenAPI spec update via Stainless API ([#76](https://github.com/orbcorp/orb-java/issues/76)) ([5013205](https://github.com/orbcorp/orb-java/commit/50132057be8af15e443e6c6ee6a3828d24b888c0))
* **client:** added structured fields to errors ([#65](https://github.com/orbcorp/orb-java/issues/65)) ([e6226f9](https://github.com/orbcorp/orb-java/commit/e6226f9a57e42c1786353757aca5b32744a24ffb))


### Chores

* **api:** rename `void` to `void_invoice` in Java SDK ([#72](https://github.com/orbcorp/orb-java/issues/72)) ([61d300a](https://github.com/orbcorp/orb-java/commit/61d300a474bca6fc47658bb3daa9dc7f1de44a16))
* **docs:** internal update ([#74](https://github.com/orbcorp/orb-java/issues/74)) ([577588d](https://github.com/orbcorp/orb-java/commit/577588daa262f51547de5eb6785226fdca41be2b))
* **docs:** internal update ([#75](https://github.com/orbcorp/orb-java/issues/75)) ([6905912](https://github.com/orbcorp/orb-java/commit/69059129d10672b1806b2288e044ff986c53d0c8))
* **internal:** codegen related update ([#71](https://github.com/orbcorp/orb-java/issues/71)) ([99ddc03](https://github.com/orbcorp/orb-java/commit/99ddc031f02c7fe5648bfad4b6de0481864707cc))
* **internal:** codegen related update ([#73](https://github.com/orbcorp/orb-java/issues/73)) ([5021325](https://github.com/orbcorp/orb-java/commit/50213258784197ba307bfe34f7c82a8ee821439a))
* **internal:** fix lint warning for isPresent ([#66](https://github.com/orbcorp/orb-java/issues/66)) ([ff81eb6](https://github.com/orbcorp/orb-java/commit/ff81eb6ab227a308b45b0fa961ce3a8759826fdf))


### Documentation

* adjust additional properties example ([#64](https://github.com/orbcorp/orb-java/issues/64)) ([f200314](https://github.com/orbcorp/orb-java/commit/f20031470e553f4e414375e536e1366c2316dfb2))

## 0.1.0-alpha.6 (2024-09-06)

Full Changelog: [v0.1.0-alpha.5...v0.1.0-alpha.6](https://github.com/orbcorp/orb-java/compare/v0.1.0-alpha.5...v0.1.0-alpha.6)

### Features

* **api:** codegen changes ([#48](https://github.com/orbcorp/orb-java/issues/48)) ([8a0190e](https://github.com/orbcorp/orb-java/commit/8a0190e72457485174719ab58948dc474d53ca25))
* **api:** OpenAPI spec update via Stainless API ([#45](https://github.com/orbcorp/orb-java/issues/45)) ([055d0a8](https://github.com/orbcorp/orb-java/commit/055d0a81db48729e99980b83ac275338d6aa1e7b))
* **api:** OpenAPI spec update via Stainless API ([#47](https://github.com/orbcorp/orb-java/issues/47)) ([cbb6cca](https://github.com/orbcorp/orb-java/commit/cbb6cca7e31e1c44ae3b00811fb5979e2912d5e8))
* **api:** OpenAPI spec update via Stainless API ([#50](https://github.com/orbcorp/orb-java/issues/50)) ([2bd0af6](https://github.com/orbcorp/orb-java/commit/2bd0af6f644d5f0273003f22af55c4116ea325a0))
* **api:** OpenAPI spec update via Stainless API ([#51](https://github.com/orbcorp/orb-java/issues/51)) ([c4e232e](https://github.com/orbcorp/orb-java/commit/c4e232ed8a840f5f0da7618f489fa3c24d9c5af4))
* **api:** OpenAPI spec update via Stainless API ([#52](https://github.com/orbcorp/orb-java/issues/52)) ([773d7e7](https://github.com/orbcorp/orb-java/commit/773d7e71970a4629fbfd32c92ebfd1c8288c3327))
* **api:** OpenAPI spec update via Stainless API ([#53](https://github.com/orbcorp/orb-java/issues/53)) ([7efa5f4](https://github.com/orbcorp/orb-java/commit/7efa5f4042e763b642d99e3b41dcf5350ceb97b8))
* **api:** OpenAPI spec update via Stainless API ([#54](https://github.com/orbcorp/orb-java/issues/54)) ([f9006eb](https://github.com/orbcorp/orb-java/commit/f9006ebdc60bb00a77a7d574c82601b32f86ac4c))
* **api:** OpenAPI spec update via Stainless API ([#55](https://github.com/orbcorp/orb-java/issues/55)) ([73ed069](https://github.com/orbcorp/orb-java/commit/73ed069286d3e6e23081f31bcae1c4739f3ef5c3))
* **api:** OpenAPI spec update via Stainless API ([#57](https://github.com/orbcorp/orb-java/issues/57)) ([4a3ce75](https://github.com/orbcorp/orb-java/commit/4a3ce752daa3fc63a858b3f94c033b5e2bde0288))


### Chores

* consistent string literal escaping ([#49](https://github.com/orbcorp/orb-java/issues/49)) ([556e69d](https://github.com/orbcorp/orb-java/commit/556e69d08db6005e58612fc83828329c9beb608c))
* **internal:** codegen related update ([#56](https://github.com/orbcorp/orb-java/issues/56)) ([837e1ed](https://github.com/orbcorp/orb-java/commit/837e1ed1619d993c680581d3dc6a9e02e1c9f8a6))

## 0.1.0-alpha.5 (2024-08-22)

Full Changelog: [v0.1.0-alpha.4...v0.1.0-alpha.5](https://github.com/orbcorp/orb-java/compare/v0.1.0-alpha.4...v0.1.0-alpha.5)

### Features

* **api:** codegen changes ([#39](https://github.com/orbcorp/orb-java/issues/39)) ([4568489](https://github.com/orbcorp/orb-java/commit/4568489793e5a8793a8ebe847efa218cdaa494e5))
* **api:** manual updates ([#40](https://github.com/orbcorp/orb-java/issues/40)) ([423de9f](https://github.com/orbcorp/orb-java/commit/423de9f49600ef8deac5049da1f96956fddcf69f))
* **api:** OpenAPI spec update via Stainless API ([#34](https://github.com/orbcorp/orb-java/issues/34)) ([3a42785](https://github.com/orbcorp/orb-java/commit/3a427852b444a502116457fb1d45ff85e9378cd5))
* **api:** OpenAPI spec update via Stainless API ([#36](https://github.com/orbcorp/orb-java/issues/36)) ([03178df](https://github.com/orbcorp/orb-java/commit/03178dfaa6bfd6a3b180438916cb44738bb084d4))
* **api:** OpenAPI spec update via Stainless API ([#37](https://github.com/orbcorp/orb-java/issues/37)) ([6d07d56](https://github.com/orbcorp/orb-java/commit/6d07d56a02f520af24180d9e825b9551c8d4bf7a))
* **api:** OpenAPI spec update via Stainless API ([#38](https://github.com/orbcorp/orb-java/issues/38)) ([a92d627](https://github.com/orbcorp/orb-java/commit/a92d627184db41c58d90bf860e1746276a4228fb))
* **api:** OpenAPI spec update via Stainless API ([#41](https://github.com/orbcorp/orb-java/issues/41)) ([64fdca5](https://github.com/orbcorp/orb-java/commit/64fdca5952f67afccb6220c99bc39a6417bb8ba2))
* **api:** OpenAPI spec update via Stainless API ([#43](https://github.com/orbcorp/orb-java/issues/43)) ([ed5e3c8](https://github.com/orbcorp/orb-java/commit/ed5e3c8cafa1abfee247ddbe824700084ef7d7a7))
* **api:** OpenAPI spec update via Stainless API ([#44](https://github.com/orbcorp/orb-java/issues/44)) ([9941471](https://github.com/orbcorp/orb-java/commit/994147155249ff02075d5c590671654cbcbb6676))


### Bug Fixes

* **docs:** use correct putAdditionalProperty value ([#42](https://github.com/orbcorp/orb-java/issues/42)) ([4f236bc](https://github.com/orbcorp/orb-java/commit/4f236bc7d29a65895aafd0c9c5e6e1745fb42bad))

## 0.1.0-alpha.4 (2024-08-14)

Full Changelog: [v0.1.0-alpha.3...v0.1.0-alpha.4](https://github.com/orbcorp/orb-java/compare/v0.1.0-alpha.3...v0.1.0-alpha.4)

### Features

* **api:** OpenAPI spec update via Stainless API ([#31](https://github.com/orbcorp/orb-java/issues/31)) ([aec4e89](https://github.com/orbcorp/orb-java/commit/aec4e89c811c7704b68ca6acbe2c81f1f2dbfd8c))

## 0.1.0-alpha.3 (2024-08-02)

Full Changelog: [v0.1.0-alpha.2...v0.1.0-alpha.3](https://github.com/orbcorp/orb-java/compare/v0.1.0-alpha.2...v0.1.0-alpha.3)

### ⚠ BREAKING CHANGES

* **api:** remove methods 'customers.usage.create' and 'customers.usage.update_by_external_id' ([#30](https://github.com/orbcorp/orb-java/issues/30))

### Features

* **api:** add 'status' to plan creation params ([#14](https://github.com/orbcorp/orb-java/issues/14)) ([02ccf47](https://github.com/orbcorp/orb-java/commit/02ccf47af0f4af169c64181f8c2a429c3bd806d5))
* **api:** add cadence enum value 'custom' ([#25](https://github.com/orbcorp/orb-java/issues/25)) ([61cf205](https://github.com/orbcorp/orb-java/commit/61cf205b1471425231e68a84f6fd09aafce2906a))
* **api:** add methods to prices and invoices ([#21](https://github.com/orbcorp/orb-java/issues/21)) ([5dbd997](https://github.com/orbcorp/orb-java/commit/5dbd9976b888c451807d1bc89e4a6648b262ada3))
* **api:** deprecate methods 'customers.usage.create' and 'customers.usage.update_by_external_id' ([#29](https://github.com/orbcorp/orb-java/issues/29)) ([756a150](https://github.com/orbcorp/orb-java/commit/756a1508b262870be8ebccef56e5485655296494))
* **api:** remove methods 'customers.usage.create' and 'customers.usage.update_by_external_id' ([#30](https://github.com/orbcorp/orb-java/issues/30)) ([988218e](https://github.com/orbcorp/orb-java/commit/988218ee7687b8864ebc9efcffd7d790db2cd193))
* **client:** improve binary return values ([#27](https://github.com/orbcorp/orb-java/issues/27)) ([e5abbb9](https://github.com/orbcorp/orb-java/commit/e5abbb9aed50ce44038e3fb3e305283c550411e0))


### Chores

* **ci:** also run workflows for PRs targeting `next` ([#17](https://github.com/orbcorp/orb-java/issues/17)) ([9f47531](https://github.com/orbcorp/orb-java/commit/9f47531a64cd4e8a53d209e4e5b151de480c3fd8))
* **ci:** limit release doctor target branches ([#22](https://github.com/orbcorp/orb-java/issues/22)) ([92f41a2](https://github.com/orbcorp/orb-java/commit/92f41a24e12e4296f8413aa91f754c35bb09eecc))
* **ci:** run tests in CI ([#28](https://github.com/orbcorp/orb-java/issues/28)) ([e4c2eb6](https://github.com/orbcorp/orb-java/commit/e4c2eb6ff95f34422415bf3fb54535da2fdc3d82))
* **docs:** document minimum Java version (Java 8) in README ([#16](https://github.com/orbcorp/orb-java/issues/16)) ([3630a08](https://github.com/orbcorp/orb-java/commit/3630a08e5894b62f238e9531dadcee4a20670cb2))
* **docs:** minor update to formatting of API link in README ([#19](https://github.com/orbcorp/orb-java/issues/19)) ([65f8385](https://github.com/orbcorp/orb-java/commit/65f8385253f16aec74d69690829ce3f3e2c05ca3))
* **internal:** refactor release doctor script ([#23](https://github.com/orbcorp/orb-java/issues/23)) ([c039b0e](https://github.com/orbcorp/orb-java/commit/c039b0ea8b1643d7bcd8d4dc1553bdc6e041f7fe))
* **internal:** remove unused test file ([#26](https://github.com/orbcorp/orb-java/issues/26)) ([71b39db](https://github.com/orbcorp/orb-java/commit/71b39dbe04efeed6d9c20363f00950334266d93e))
* minor updates ([#20](https://github.com/orbcorp/orb-java/issues/20)) ([42c2a5c](https://github.com/orbcorp/orb-java/commit/42c2a5c9bca4a2af016fa724ce78197fc6a05549))
* **tests:** update prism version ([#24](https://github.com/orbcorp/orb-java/issues/24)) ([b14155d](https://github.com/orbcorp/orb-java/commit/b14155d55ee6c312d415037fccce9a90ccd0b58f))


### Documentation

* **examples:** update example values ([#18](https://github.com/orbcorp/orb-java/issues/18)) ([7943f58](https://github.com/orbcorp/orb-java/commit/7943f58bb9615f95d33dba70040c2cfcc4edb7db))

## 0.1.0-alpha.2 (2024-06-28)

Full Changelog: [v0.1.0-alpha.1...v0.1.0-alpha.2](https://github.com/orbcorp/orb-java/compare/v0.1.0-alpha.1...v0.1.0-alpha.2)

### ⚠ BREAKING CHANGES

* **api:** endpoint expects amount of new allocation price to be a string, not a number ([#10](https://github.com/orbcorp/orb-java/issues/10))

### Features

* **api:** add support for adding allocation price to subscription ([#8](https://github.com/orbcorp/orb-java/issues/8)) ([d150c33](https://github.com/orbcorp/orb-java/commit/d150c33743c505658aeb09b639ea4b739ad4322c))
* **api:** add support for query param include_all_blocks ([#11](https://github.com/orbcorp/orb-java/issues/11)) ([73d5e94](https://github.com/orbcorp/orb-java/commit/73d5e9453745dda4c138bed77c3dc71b306f37f3))
* **api:** external connections made optional when updating items ([#9](https://github.com/orbcorp/orb-java/issues/9)) ([d1a63a3](https://github.com/orbcorp/orb-java/commit/d1a63a3edcd71535e421b9ded0f749e96d18b253))
* **api:** updates ([#5](https://github.com/orbcorp/orb-java/issues/5)) ([fb8c7d9](https://github.com/orbcorp/orb-java/commit/fb8c7d974e51d260d1bb9aa1f93021a64288589a))
* **client:** add support for `putQueryParam` on `ClientOptions` ([#6](https://github.com/orbcorp/orb-java/issues/6)) ([71d82b0](https://github.com/orbcorp/orb-java/commit/71d82b0545a51df2abb8ebfe852991d9f740d498))


### Bug Fixes

* **api:** endpoint expects amount of new allocation price to be a string, not a number ([#10](https://github.com/orbcorp/orb-java/issues/10)) ([f38419a](https://github.com/orbcorp/orb-java/commit/f38419a6c6b10b5137d573dfc9c7f5a96a302348))


### Chores

* **docs:** improve Coupon description ([#7](https://github.com/orbcorp/orb-java/issues/7)) ([4d1d183](https://github.com/orbcorp/orb-java/commit/4d1d183eba7883c30007edc2aac0ab27c5e62600))
* **docs:** updates price intervals docs ([#12](https://github.com/orbcorp/orb-java/issues/12)) ([554df1b](https://github.com/orbcorp/orb-java/commit/554df1b92b83237d8f88cea66bee47524ee8d9db))
* gitignore test server logs ([#13](https://github.com/orbcorp/orb-java/issues/13)) ([11e4ebc](https://github.com/orbcorp/orb-java/commit/11e4ebc52501ab8c6ea3ba15eff0ef82134eda89))


### Documentation

* small updates ([#3](https://github.com/orbcorp/orb-java/issues/3)) ([11b888b](https://github.com/orbcorp/orb-java/commit/11b888b44a0063a15bb0bdee64273659b9cc4514))

## 0.1.0-alpha.1 (2024-06-06)

Full Changelog: [v0.0.1-alpha.0...v0.1.0-alpha.1](https://github.com/orbcorp/orb-java/compare/v0.0.1-alpha.0...v0.1.0-alpha.1)

### ⚠ BREAKING CHANGES

* **api:** add semi_annual cadence and remove metadata from update items ([#2](https://github.com/orbcorp/orb-java/issues/2))

### Features

* **api:** add semi_annual cadence and remove metadata from update items ([#2](https://github.com/orbcorp/orb-java/issues/2)) ([abd4f60](https://github.com/orbcorp/orb-java/commit/abd4f603a990cff62ef409f7c1620867ad1e9c3b))


### Bug Fixes

* **unions:** fix namespacing in example types for unions that have models ([846d155](https://github.com/orbcorp/orb-java/commit/846d15562417ca933515297623d630db0ec9e9a0))
