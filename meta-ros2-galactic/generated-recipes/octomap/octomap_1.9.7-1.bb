# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_galactic
inherit ros_superflore_generated

DESCRIPTION = "The OctoMap library implements a 3D occupancy grid mapping approach, providing data structures and mapping algorithms in C++. The map implementation is based on an octree. See   http://octomap.github.io for details."
AUTHOR = "Armin Hornung <armin@hornung.io>"
ROS_AUTHOR = "Kai M. Wurm <wurm@informatik.uni-freiburg.de>"
HOMEPAGE = "http://octomap.github.io"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "octomap"
ROS_BPN = "octomap"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ament-cmake \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/octomap-release/archive/release/galactic/octomap/1.9.7-1.tar.gz
ROS_BRANCH ?= "branch=release/galactic/octomap"
SRC_URI = "git://github.com/ros-gbp/octomap-release;${ROS_BRANCH};protocol=https"
SRCREV = "066b88de7ef6b8deafa1dce5db0f83186263fc61"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}