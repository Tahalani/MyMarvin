folder('Tools') {
  displayName('Tools')
  description('Folder for miscellaneous tools.')
}
freeStyleJob('Tools/clone-repository') {
  wrappers {
    preBuildCleanup ()
  }
  parameters {
    stringParam("GIT_REPOSITORY_URL", "", "Git URL of the repository to clone")
  }
  scm {
    git {
      remote {
        url('\$GIT_REPOSITORY_URL')
      }
    }
  }
}
