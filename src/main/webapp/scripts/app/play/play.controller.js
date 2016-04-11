(function() {
  'use strict';

  angular
    .module('frontTvWeb')
    .controller('PlayController',PlayController);

  /** @ngInject */
  function PlayController( MainService, TvService,$log) {
    var vm = this;
    vm.isCollapsed = false;

  } //End of MainController

})();
