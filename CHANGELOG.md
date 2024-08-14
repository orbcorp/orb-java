# Changelog

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
