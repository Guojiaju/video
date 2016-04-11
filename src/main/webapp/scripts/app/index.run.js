(function() {
  'use strict';

  angular
    .module('frontTvWeb')
    .run(runBlock);

  /** @ngInject */
  function runBlock($log) {

    $log.debug('runBlock end');
  }

})();
